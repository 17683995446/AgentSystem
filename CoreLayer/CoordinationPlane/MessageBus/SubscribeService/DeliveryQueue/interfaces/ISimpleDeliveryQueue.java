package agent.corelayer.coordinationplane.messagebus.subscribeservice.deliveryqueue.interfaces;

public interface ISimpleDeliveryQueue {
    void enqueueMessageItem();
    void dequeueMessageItem();
    void peekNextDelivery();
    void purgeExpiredItems();
    void reorderByPriority();
}
