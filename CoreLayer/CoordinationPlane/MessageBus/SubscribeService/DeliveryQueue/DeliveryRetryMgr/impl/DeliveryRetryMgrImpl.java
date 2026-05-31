package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.deliveryqueue.deliveryretrymgr.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.deliveryqueue.deliveryretrymgr.interfaces.IDeliveryRetryMgr;

public class DeliveryRetryMgrImpl implements IDeliveryRetryMgr {
    private final Map<String, Integer> attempts = new ConcurrentHashMap<>();
    private static final int MAX_RETRIES = 3;

    public void recordAttempt(String messageId) {
        attempts.merge(messageId, 1, Integer::sum);
    }

    public boolean canRetry(String messageId) {
        return attempts.getOrDefault(messageId, 0) < MAX_RETRIES;
    }

    public int getRetryCount(String messageId) {
        return attempts.getOrDefault(messageId, 0);
    }

    public void reset(String messageId) {
        attempts.remove(messageId);
    }
}
