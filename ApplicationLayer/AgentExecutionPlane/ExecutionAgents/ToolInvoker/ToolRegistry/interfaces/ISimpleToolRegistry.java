package agent.applicationlayer.agentexecutionplane.executionagents.toolinvoker.toolregistry.interfaces;

public interface ISimpleToolRegistry {
    void registerTool();
    void unregisterTool();
    void listAllTools();
    void findToolByName();
}
