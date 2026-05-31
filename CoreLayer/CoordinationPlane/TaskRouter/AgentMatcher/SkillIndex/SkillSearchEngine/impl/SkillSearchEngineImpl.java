package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.skillindex.skillsearchengine.impl;

import java.util.List;
import java.util.ArrayList;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.skillindex.skillsearchengine.interfaces.ISkillSearchEngine;

public class SkillSearchEngineImpl implements ISkillSearchEngine {
    public List<String> search(String query) {
        return new ArrayList<>();
    }

    public List<String> searchByPrefix(String prefix) {
        return new ArrayList<>();
    }

    public void refreshIndex() {
    }

    public int getIndexedCount() {
        return 0;
    }
}
