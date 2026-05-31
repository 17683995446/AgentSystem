package CoreLayer.ControlPlane.TaskPlanning.LocalPlan.StepGenerator.StepParamBinder.interfaces;

public interface IStepParamBinder {
    void bindParameters();
    void resolveValues();
    void applyDefaults();
    void validateBinding();
}
