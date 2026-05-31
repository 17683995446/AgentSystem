package workspace.agentsystem.corelayer.coordinationplane.taskrouter.agentmatcher.loadbalancer.loadmetriccollector.interfaces;

import java.util.Map;

public interface ILoadMetricCollector {
    void record(String agentId, double load);
    Map<String, Double> getAll();
    double getLoad(String agentId);
    void clear();
}
