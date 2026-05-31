package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.topicregistry.topicnamevalidator.interfaces;

public interface ITopicNameValidator {
    boolean isValid(String topicName);
    String normalize(String topicName);
    boolean isReserved(String topicName);
    boolean matchesPattern(String topicName, String pattern);
}
