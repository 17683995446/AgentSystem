package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.costestimator.resourcecostmodel.interfaces;

public interface IResourceCostModel {
    double estimateCpuCost(String taskId);
    double estimateMemoryCost(String taskId);
    double estimateNetworkCost(String endpoint);
    void setResourcePrice(String resource, double price);
}
