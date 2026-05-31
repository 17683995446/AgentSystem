package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.deliveryqueue.deliveryretrymgr.interfaces;

public interface IDeliveryRetryMgr {
    void recordAttempt(String messageId);
    boolean canRetry(String messageId);
    int getRetryCount(String messageId);
    void reset(String messageId);
}
