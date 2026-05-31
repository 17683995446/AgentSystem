package agent.corelayer.controlplane.taskplanning.localplan.stepgenerator.interfaces;

public interface ISimpleStepGenerator {
    void generateSingleStep();
    void resetStepState();
    void previewNextStep();
    void cloneLastStep();
    void rollbackOneStep();
}
