package CoreLayer.ControlPlane.TaskPlanning.GlobalPlan.GoalAnalyzer.GoalPriorityRank.interfaces;

public interface IGoalPriorityRank {
    void rankGoals();
    void sortByPriority();
    void assignWeights();
    void reorderList();
}
