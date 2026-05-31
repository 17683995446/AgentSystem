package agent.corelayer.controlplane.rulegovernance.permissioncontrol.rolemanager.interfaces;

public interface ISimpleRoleManager {
    void assignUserRole();
    void revokeUserRole();
    void listActiveRoles();
    void checkRoleExpiry();
    void syncRoleState();
}
