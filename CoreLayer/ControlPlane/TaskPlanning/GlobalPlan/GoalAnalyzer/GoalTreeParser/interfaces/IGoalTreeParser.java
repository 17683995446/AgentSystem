package CoreLayer.ControlPlane.TaskPlanning.GlobalPlan.GoalAnalyzer.GoalTreeParser.interfaces;

public interface IGoalTreeParser {
    void parseGoalTree();
    void extractNodes();
    void buildHierarchy();
    void validateStructure();
}
