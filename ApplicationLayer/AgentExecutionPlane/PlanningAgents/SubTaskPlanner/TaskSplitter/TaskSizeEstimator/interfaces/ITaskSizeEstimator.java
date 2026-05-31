package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.tasksplitter.tasksizestimator.interfaces;

public interface ITaskSizeEstimator {
    int estimateSteps(String taskDesc);
    int estimateTokens(String taskDesc);
    boolean isOversized(String taskDesc, int threshold);
    double estimateComplexity(String taskDesc);
}
