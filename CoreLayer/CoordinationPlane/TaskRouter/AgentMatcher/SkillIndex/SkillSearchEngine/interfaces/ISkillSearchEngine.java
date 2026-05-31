package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.skillindex.skillsearchengine.interfaces;

import java.util.List;

public interface ISkillSearchEngine {
    List<String> search(String query);
    List<String> searchByPrefix(String prefix);
    void refreshIndex();
    int getIndexedCount();
}
