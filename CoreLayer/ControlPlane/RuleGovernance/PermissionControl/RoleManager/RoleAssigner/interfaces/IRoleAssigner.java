package CoreLayer.ControlPlane.RuleGovernance.PermissionControl.RoleManager.RoleAssigner.interfaces;

public interface IRoleAssigner {
    void assignRole();
    void revokeRole();
    void checkAssignment();
    void listAssignments();
}
