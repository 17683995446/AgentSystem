package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.toolregistry.toolmetaloader.impl;

import java.util.Map;
import workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.toolregistry.toolmetaloader.interfaces.IToolMetaLoader;

public class ToolMetaLoaderImpl implements IToolMetaLoader {
    @Override
    public Map<String, Object> loadMeta(String toolId) {
        return null;
    }

    @Override
    public boolean hasMeta(String toolId) {
        return false;
    }

    @Override
    public void refreshMeta(String toolId) {
    }

    @Override
    public Map<String, Object> listAllMeta() {
        return null;
    }
}
