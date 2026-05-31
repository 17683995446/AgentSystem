package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.loadbalancer.loaddistributor.interfaces;

import java.util.List;

public interface ILoadDistributor {
    String select(List<String> candidates);
    void updateWeight(String agentId, double weight);
    void setStrategy(String strategy);
    void reset();
}
