package agent.corelayer.controlplane.rulegovernance.conflictresolution.interfaces;

public interface IConflictResolution {
    void detectConflict();
    void resolveConflict();
    void escalateConflict();
    void logConflict();
}
