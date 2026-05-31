package agent.corelayer.coordinationplane.messagebus.publishservice.topicregistry.interfaces;

public interface ISimpleTopicRegistry {
    void registerNewTopic();
    void unregisterOldTopic();
    void listActiveTopics();
    void lookupTopicMeta();
    void pruneDeadTopics();
}
