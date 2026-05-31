package agent.corelayer.controlplane.taskplanning.localplan.interfaces;

public interface ILocalTaskPlan {
    void createLocalPlan();
    void mergeLocalPlans();
    void validateLocalPlan();
    void executeLocalPlan();
}
