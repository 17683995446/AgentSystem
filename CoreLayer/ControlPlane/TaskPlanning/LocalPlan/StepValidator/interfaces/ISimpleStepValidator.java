package agent.corelayer.controlplane.taskplanning.localplan.stepvalidator.interfaces;

public interface ISimpleStepValidator {
    void validateSingleStep();
    void checkStepSyntax();
    void verifyStepOrder();
    void flagInvalidStep();
    void clearStepErrors();
}
