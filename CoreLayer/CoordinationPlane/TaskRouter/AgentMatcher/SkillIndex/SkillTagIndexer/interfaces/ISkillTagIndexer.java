package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.skillindex.skilltagindexer.interfaces;

import java.util.List;

public interface ISkillTagIndexer {
    void index(String agentId, List<String> tags);
    List<String> getTags(String agentId);
    void removeAgent(String agentId);
    List<String> findAgentsByTag(String tag);
}
