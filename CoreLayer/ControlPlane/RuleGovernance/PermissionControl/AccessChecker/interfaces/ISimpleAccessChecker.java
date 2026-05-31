package agent.corelayer.controlplane.rulegovernance.permissioncontrol.accesschecker.interfaces;

public interface ISimpleAccessChecker {
    void verifyUserAccess();
    void checkResourceLock();
    void auditAccessLog();
    void validateTokenScope();
    void refreshAccessGate();
}
