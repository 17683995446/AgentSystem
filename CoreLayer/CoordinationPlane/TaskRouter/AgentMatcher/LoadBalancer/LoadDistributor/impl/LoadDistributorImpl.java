package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.loadbalancer.loaddistributor.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.loadbalancer.loaddistributor.interfaces.ILoadDistributor;

public class LoadDistributorImpl implements ILoadDistributor {
    private final Map<String, Double> weights = new ConcurrentHashMap<>();
    private String strategy = "round_robin";

    public String select(List<String> candidates) {
        return candidates.isEmpty() ? null : candidates.get(0);
    }

    public void updateWeight(String agentId, double weight) {
        weights.put(agentId, weight);
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void reset() {
        weights.clear();
    }
}
