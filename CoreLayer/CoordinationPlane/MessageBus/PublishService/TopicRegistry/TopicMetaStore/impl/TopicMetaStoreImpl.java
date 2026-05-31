package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.topicregistry.topicmetastore.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.topicregistry.topicmetastore.interfaces.ITopicMetaStore;

public class TopicMetaStoreImpl implements ITopicMetaStore {
    private final Map<String, Map<String, String>> store = new ConcurrentHashMap<>();

    public void register(String topic, Map<String, String> meta) {
        store.put(topic, meta);
    }

    public Map<String, String> getMeta(String topic) {
        return store.get(topic);
    }

    public void unregister(String topic) {
        store.remove(topic);
    }

    public boolean exists(String topic) {
        return store.containsKey(topic);
    }
}
