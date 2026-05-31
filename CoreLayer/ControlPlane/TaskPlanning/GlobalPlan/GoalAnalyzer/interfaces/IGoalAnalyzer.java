package agent.corelayer.controlplane.taskplanning.globalplan.goalanalyzer.interfaces;

public interface IGoalAnalyzer {
    void parseGoalInput();
    void decomposeGoalTree();
    void analyzeGoalPriority();
    void validateGoalScope();
    void reportGoalMetrics();
}
