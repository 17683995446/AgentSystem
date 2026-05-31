package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.topicregistry.topicnamevalidator.impl;

import workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.topicregistry.topicnamevalidator.interfaces.ITopicNameValidator;

public class TopicNameValidatorImpl implements ITopicNameValidator {
    public boolean isValid(String topicName) {
        return topicName != null && !topicName.isEmpty();
    }

    public String normalize(String topicName) {
        return topicName.trim().toLowerCase();
    }

    public boolean isReserved(String topicName) {
        return topicName.startsWith("__");
    }

    public boolean matchesPattern(String topicName, String pattern) {
        return topicName.matches(pattern);
    }
}
