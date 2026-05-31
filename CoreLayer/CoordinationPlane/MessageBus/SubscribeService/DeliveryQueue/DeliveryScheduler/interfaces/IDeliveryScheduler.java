package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.deliveryqueue.deliveryscheduler.interfaces;

public interface IDeliveryScheduler {
    void schedule(String messageId, String subscriberId, long delayMs);
    void cancel(String messageId);
    boolean isScheduled(String messageId);
    int getPendingCount();
}
