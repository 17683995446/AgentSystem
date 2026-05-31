package agent.corelayer.controlplane.taskplanning.globalplan.interfaces;

public interface IGlobalTaskPlan {
    void createPlan();
    void mergePlans();
    void validatePlan();
    void executePlan();
}
