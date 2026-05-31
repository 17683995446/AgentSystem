package CoreLayer.ControlPlane.RuleGovernance.ConflictResolution.RuleArbiter.RuleOverrideSet.interfaces;

public interface IRuleOverrideSet {
    void addOverride();
    void removeOverride();
    void checkOverride();
    void listOverrides();
}
