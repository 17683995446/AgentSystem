package agent.applicationlayer.infrastructureplane.observationsystem.tracelogger.logexporter.interfaces;

public interface ISimpleLogExporter {
    void exportLogToFile();
    void exportLogToStream();
    void formatLogOutput();
    void closeLogExport();
}
