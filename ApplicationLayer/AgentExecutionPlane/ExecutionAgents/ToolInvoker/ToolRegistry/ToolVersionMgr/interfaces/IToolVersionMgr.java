package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.toolregistry.toolversionmgr.interfaces;

public interface IToolVersionMgr {
    String getCurrentVersion(String toolId);
    boolean isCompatible(String toolId, String requiredVersion);
    void registerVersion(String toolId, String version);
    String resolveVersion(String toolId, String constraint);
}
