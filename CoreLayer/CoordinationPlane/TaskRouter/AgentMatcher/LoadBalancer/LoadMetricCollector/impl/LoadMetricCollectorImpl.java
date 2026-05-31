package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.loadbalancer.loadmetriccollector.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.loadbalancer.loadmetriccollector.interfaces.ILoadMetricCollector;

public class LoadMetricCollectorImpl implements ILoadMetricCollector {
    private final Map<String, Double> metrics = new ConcurrentHashMap<>();

    public void record(String agentId, double load) {
        metrics.put(agentId, load);
    }

    public Map<String, Double> getAll() {
        return new ConcurrentHashMap<>(metrics);
    }

    public double getLoad(String agentId) {
        return metrics.getOrDefault(agentId, 0.0);
    }

    public void clear() {
        metrics.clear();
    }
}
