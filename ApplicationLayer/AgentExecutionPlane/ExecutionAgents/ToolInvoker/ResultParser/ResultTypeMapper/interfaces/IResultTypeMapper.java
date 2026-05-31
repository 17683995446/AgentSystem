package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.resultparser.resulttypemapper.interfaces;

public interface IResultTypeMapper {
    Object mapToTargetType(Object rawResult, String targetType);
    boolean supportsType(String typeName);
    String inferType(Object rawResult);
    Object castValue(Object value, String typeName);
}
