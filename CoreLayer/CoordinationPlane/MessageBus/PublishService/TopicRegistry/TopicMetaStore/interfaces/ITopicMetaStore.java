package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.topicregistry.topicmetastore.interfaces;

import java.util.Map;

public interface ITopicMetaStore {
    void register(String topic, Map<String, String> meta);
    Map<String, String> getMeta(String topic);
    void unregister(String topic);
    boolean exists(String topic);
}
