package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.resultparser.resultvalidator.impl;

import workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.resultparser.resultvalidator.interfaces.IResultValidator;

public class ResultValidatorImpl implements IResultValidator {
    @Override
    public boolean isValid(Object result) {
        return false;
    }

    @Override
    public String getValidationError(Object result) {
        return null;
    }

    @Override
    public boolean validateSchema(Object result, String schemaId) {
        return false;
    }

    @Override
    public boolean validateRange(Object result, double min, double max) {
        return false;
    }
}
