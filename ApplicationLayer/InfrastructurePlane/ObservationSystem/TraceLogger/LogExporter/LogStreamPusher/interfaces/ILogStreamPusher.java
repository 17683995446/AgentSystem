package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logexporter.logstreampusher.interfaces;

public interface ILogStreamPusher {
    void pushEntry(String entry);

    void connect(String endpoint);

    void disconnect();

    boolean isConnected();
}
