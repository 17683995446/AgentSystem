package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.toolregistry.toolversionmgr.impl;

import workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.toolregistry.toolversionmgr.interfaces.IToolVersionMgr;

public class ToolVersionMgrImpl implements IToolVersionMgr {
    @Override
    public String getCurrentVersion(String toolId) {
        return null;
    }

    @Override
    public boolean isCompatible(String toolId, String requiredVersion) {
        return false;
    }

    @Override
    public void registerVersion(String toolId, String version) {
    }

    @Override
    public String resolveVersion(String toolId, String constraint) {
        return null;
    }
}
