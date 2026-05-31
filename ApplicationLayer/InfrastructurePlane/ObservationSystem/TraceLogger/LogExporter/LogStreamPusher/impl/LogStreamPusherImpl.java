package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logexporter.logstreampusher.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logexporter.logstreampusher.interfaces.ILogStreamPusher;

public class LogStreamPusherImpl implements ILogStreamPusher {
    @Override
    public void pushEntry(String entry) {
    }

    @Override
    public void connect(String endpoint) {
    }

    @Override
    public void disconnect() {
    }

    @Override
    public boolean isConnected() {
        return false;
    }
}
