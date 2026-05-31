package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.toolinvoker.toolregistry.toolmetaloader.interfaces;

import java.util.Map;

public interface IToolMetaLoader {
    Map<String, Object> loadMeta(String toolId);
    boolean hasMeta(String toolId);
    void refreshMeta(String toolId);
    Map<String, Object> listAllMeta();
}
