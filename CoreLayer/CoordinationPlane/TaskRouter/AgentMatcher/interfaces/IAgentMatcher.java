package agent.corelayer.coordinationplane.taskrouter.agentmatcher.interfaces;

public interface IAgentMatcher {
    void matchAgent();
    void scoreAgent();
    void selectAgent();
    void bindAgent();
}
