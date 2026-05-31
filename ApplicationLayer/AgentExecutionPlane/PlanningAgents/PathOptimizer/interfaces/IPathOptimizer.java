package agent.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.interfaces;

public interface IPathOptimizer {
    void analyzePath();
    void optimizePath();
    void validatePath();
    void selectBestPath();
}
