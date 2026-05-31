package agent.applicationlayer.agentexecutionplane.executionagents.toolinvoker.interfaces;

public interface IToolInvoker {
    void discoverTools();
    void invokeTool();
    void handleToolResult();
    void retryToolCall();
}
