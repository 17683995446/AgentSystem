package agent.corelayer.coordinationplane.taskrouter.agentmatcher.loadbalancer.interfaces;

public interface ISimpleLoadBalancer {
    void computeAgentLoad();
    void pickLeastLoaded();
    void rebalanceAgents();
    void drainAgentTasks();
    void reportLoadStats();
}
