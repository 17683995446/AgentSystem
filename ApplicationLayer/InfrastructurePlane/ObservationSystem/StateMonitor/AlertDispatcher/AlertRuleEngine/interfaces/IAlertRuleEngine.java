package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.alertdispatcher.alertruleengine.interfaces;

public interface IAlertRuleEngine {
    boolean evaluateRule(String ruleId, double value);

    void addRule(String ruleId, String condition);

    void removeRule(String ruleId);

    void enableRule(String ruleId, boolean enabled);
}
