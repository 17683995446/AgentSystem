package CoreLayer.ControlPlane.RuleGovernance.PermissionControl.AccessChecker.AccessTokenMgr.interfaces;

public interface IAccessTokenMgr {
    void issueToken();
    void revokeToken();
    void validateToken();
    void refreshToken();
}
