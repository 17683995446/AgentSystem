package agent.applicationlayer.infrastructureplane.observationsystem.statemonitor.interfaces;

public interface IStateMonitor {
    void collectState();
    void analyzeState();
    void alertOnAnomaly();
    void reportState();
}
