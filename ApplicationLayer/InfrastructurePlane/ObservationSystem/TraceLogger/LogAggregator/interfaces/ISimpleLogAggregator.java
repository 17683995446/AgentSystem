package agent.applicationlayer.infrastructureplane.observationsystem.tracelogger.logaggregator.interfaces;

public interface ISimpleLogAggregator {
    void collectLogBatch();
    void aggregateLogData();
    void compressLogBatch();
    void flushLogBuffer();
}
