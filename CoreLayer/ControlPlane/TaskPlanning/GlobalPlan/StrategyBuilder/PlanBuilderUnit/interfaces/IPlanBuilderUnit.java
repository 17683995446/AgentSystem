package CoreLayer.ControlPlane.TaskPlanning.GlobalPlan.StrategyBuilder.PlanBuilderUnit.interfaces;

public interface IPlanBuilderUnit {
    void configureUnit();
    void executeBuild();
    void checkStatus();
    void resetUnit();
}
