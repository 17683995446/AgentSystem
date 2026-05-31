package agent.applicationlayer.infrastructureplane.observationsystem.statemonitor.alertdispatcher.interfaces;

public interface ISimpleAlertDispatcher {
    void registerAlertRule();
    void evaluateAlertCondition();
    void dispatchAlertEvent();
    void resolveAlertEvent();
}
