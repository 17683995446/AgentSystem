package agent.corelayer.controlplane.rulegovernance.permissioncontrol.interfaces;

public interface IPermissionControl {
    void grantPermission();
    void revokePermission();
    void checkPermission();
    void listPermissions();
}
