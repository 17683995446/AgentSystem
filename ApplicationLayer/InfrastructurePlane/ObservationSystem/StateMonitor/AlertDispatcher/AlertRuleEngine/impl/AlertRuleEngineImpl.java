package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.alertdispatcher.alertruleengine.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.alertdispatcher.alertruleengine.interfaces.IAlertRuleEngine;

public class AlertRuleEngineImpl implements IAlertRuleEngine {
    @Override
    public boolean evaluateRule(String ruleId, double value) {
        return false;
    }

    @Override
    public void addRule(String ruleId, String condition) {
    }

    @Override
    public void removeRule(String ruleId) {
    }

    @Override
    public void enableRule(String ruleId, boolean enabled) {
    }
}
