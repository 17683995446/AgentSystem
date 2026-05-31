package agent.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.costestimator.interfaces;

public interface ISimpleCostEstimator {
    void estimateTimeCost();
    void estimateResourceCost();
    void estimateRiskCost();
    void sumTotalCost();
}
