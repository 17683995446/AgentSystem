package CoreLayer.ControlPlane.TaskPlanning.GlobalPlan.StrategyBuilder.PlanBuilderTool.interfaces;

public interface IPlanBuilderTool {
    void initBuilder();
    void buildPlan();
    void validatePlan();
    void finalizePlan();
}
