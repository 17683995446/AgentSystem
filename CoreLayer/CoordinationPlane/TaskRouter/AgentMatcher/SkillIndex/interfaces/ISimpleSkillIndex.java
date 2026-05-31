package agent.corelayer.coordinationplane.taskrouter.agentmatcher.skillindex.interfaces;

public interface ISimpleSkillIndex {
    void indexAgentSkills();
    void querySkillMatch();
    void removeSkillEntry();
    void rebuildSkillIndex();
    void rankSkillFit();
}
