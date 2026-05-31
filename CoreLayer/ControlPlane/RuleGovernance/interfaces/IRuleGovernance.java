package agent.corelayer.controlplane.rulegov.interfaces;

public interface IRuleGovernance {
    void enforcePermission();
    void resolveConflict();
}
