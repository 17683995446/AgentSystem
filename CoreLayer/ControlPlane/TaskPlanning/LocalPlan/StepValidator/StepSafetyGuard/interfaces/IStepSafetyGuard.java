package CoreLayer.ControlPlane.TaskPlanning.LocalPlan.StepValidator.StepSafetyGuard.interfaces;

public interface IStepSafetyGuard {
    void assessRiskLevel();
    void enforceLimits();
    void triggerAlarm();
    void logIncident();
}
