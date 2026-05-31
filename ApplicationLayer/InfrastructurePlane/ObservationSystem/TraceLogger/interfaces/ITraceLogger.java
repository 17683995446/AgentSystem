package agent.applicationlayer.infrastructureplane.observationsystem.tracelogger.interfaces;

public interface ITraceLogger {
    void logTraceEvent();
    void queryTraceLog();
    void exportTraceLog();
    void rotateTraceLog();
}
