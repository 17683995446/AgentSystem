package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.costestimator.timecostmodel.impl;

import workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.costestimator.timecostmodel.interfaces.ITimeCostModel;

public class TimeCostModelImpl implements ITimeCostModel {
    @Override
    public double estimateLatency(String routeId) {
        return 0.0;
    }

    @Override
    public double estimateExecutionTime(String taskId) {
        return 0.0;
    }

    @Override
    public double getTimeWeight(String metric) {
        return 0.0;
    }

    @Override
    public void updateTimeFactor(String factor, double value) {
    }
}
