package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.skillindex.skilltagindexer.impl;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.skillindex.skilltagindexer.interfaces.ISkillTagIndexer;

public class SkillTagIndexerImpl implements ISkillTagIndexer {
    private final Map<String, List<String>> index = new ConcurrentHashMap<>();

    public void index(String agentId, List<String> tags) {
        index.put(agentId, new ArrayList<>(tags));
    }

    public List<String> getTags(String agentId) {
        return index.getOrDefault(agentId, new ArrayList<>());
    }

    public void removeAgent(String agentId) {
        index.remove(agentId);
    }

    public List<String> findAgentsByTag(String tag) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : index.entrySet()) {
            if (entry.getValue().contains(tag)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
