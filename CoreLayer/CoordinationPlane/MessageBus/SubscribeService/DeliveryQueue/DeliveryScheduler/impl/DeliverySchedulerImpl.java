package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.deliveryqueue.deliveryscheduler.impl;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.deliveryqueue.deliveryscheduler.interfaces.IDeliveryScheduler;

public class DeliverySchedulerImpl implements IDeliveryScheduler {
    private final Set<String> scheduled = ConcurrentHashMap.newKeySet();

    public void schedule(String messageId, String subscriberId, long delayMs) {
        scheduled.add(messageId);
    }

    public void cancel(String messageId) {
        scheduled.remove(messageId);
    }

    public boolean isScheduled(String messageId) {
        return scheduled.contains(messageId);
    }

    public int getPendingCount() {
        return scheduled.size();
    }
}
