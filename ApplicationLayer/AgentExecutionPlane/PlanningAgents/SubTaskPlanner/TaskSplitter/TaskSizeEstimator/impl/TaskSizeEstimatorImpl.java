package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.tasksplitter.tasksizestimator.impl;

import workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.tasksplitter.tasksizestimator.interfaces.ITaskSizeEstimator;

public class TaskSizeEstimatorImpl implements ITaskSizeEstimator {
    @Override
    public int estimateSteps(String taskDesc) {
        return 0;
    }

    @Override
    public int estimateTokens(String taskDesc) {
        return 0;
    }

    @Override
    public boolean isOversized(String taskDesc, int threshold) {
        return false;
    }

    @Override
    public double estimateComplexity(String taskDesc) {
        return 0.0;
    }
}
