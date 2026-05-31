package CoreLayer.ControlPlane.RuleGovernance.ConflictResolution.RuleArbiter.RulePriorityMap.interfaces;

public interface IRulePriorityMap {
    void definePriority();
    void lookupPriority();
    void updatePriority();
    void listPriorities();
}
