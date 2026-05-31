package CoreLayer.ControlPlane.RuleGovernance.PermissionControl.AccessChecker.AccessAuditLog.interfaces;

public interface IAccessAuditLog {
    void logAccessEvent();
    void queryAuditLog();
    void exportAuditLog();
    void purgeAuditLog();
}
