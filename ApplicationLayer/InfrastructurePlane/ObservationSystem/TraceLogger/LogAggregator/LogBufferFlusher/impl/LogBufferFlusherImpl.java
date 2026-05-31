package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logaggregator.logbufferflusher.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logaggregator.logbufferflusher.interfaces.ILogBufferFlusher;

public class LogBufferFlusherImpl implements ILogBufferFlusher {
    @Override
    public void flushBuffer() {
    }

    @Override
    public void scheduleFlush(int intervalMs) {
    }

    @Override
    public boolean isBufferEmpty() {
        return false;
    }

    @Override
    public void forceFlush() {
    }
}
