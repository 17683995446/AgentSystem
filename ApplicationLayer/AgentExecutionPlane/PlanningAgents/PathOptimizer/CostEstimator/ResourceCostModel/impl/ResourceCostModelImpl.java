package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.costestimator.resourcecostmodel.impl;

import workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.costestimator.resourcecostmodel.interfaces.IResourceCostModel;

public class ResourceCostModelImpl implements IResourceCostModel {
    @Override
    public double estimateCpuCost(String taskId) {
        return 0.0;
    }

    @Override
    public double estimateMemoryCost(String taskId) {
        return 0.0;
    }

    @Override
    public double estimateNetworkCost(String endpoint) {
        return 0.0;
    }

    @Override
    public void setResourcePrice(String resource, double price) {
    }
}
