package agent.corelayer.controlplane.rulegovernance.conflictresolution.rulearbiter.interfaces;

public interface ISimpleRuleArbiter {
    void evaluateRulePair();
    void pickHigherPriority();
    void logArbiterChoice();
    void notifyRuleLosers();
    void resetArbiterCache();
}
