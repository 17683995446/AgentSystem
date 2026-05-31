package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.resultparser.resultvalidator.interfaces;

public interface IResultValidator {
    boolean isValid(Object result);
    String getValidationError(Object result);
    boolean validateSchema(Object result, String schemaId);
    boolean validateRange(Object result, double min, double max);
}
