package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logaggregator.logbufferflusher.interfaces;

public interface ILogBufferFlusher {
    void flushBuffer();

    void scheduleFlush(int intervalMs);

    boolean isBufferEmpty();

    void forceFlush();
}
