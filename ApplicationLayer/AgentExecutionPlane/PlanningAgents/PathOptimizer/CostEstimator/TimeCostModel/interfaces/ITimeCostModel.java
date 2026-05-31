package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.costestimator.timecostmodel.interfaces;

public interface ITimeCostModel {
    double estimateLatency(String routeId);
    double estimateExecutionTime(String taskId);
    double getTimeWeight(String metric);
    void updateTimeFactor(String factor, double value);
}
