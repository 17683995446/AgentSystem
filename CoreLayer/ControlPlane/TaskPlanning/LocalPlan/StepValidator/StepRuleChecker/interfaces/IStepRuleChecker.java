package CoreLayer.ControlPlane.TaskPlanning.LocalPlan.StepValidator.StepRuleChecker.interfaces;

public interface IStepRuleChecker {
    void checkPreconditions();
    void verifyConstraints();
    void evaluateRules();
    void reportViolations();
}
