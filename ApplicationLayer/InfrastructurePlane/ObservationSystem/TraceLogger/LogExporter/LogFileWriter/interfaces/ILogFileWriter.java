package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logexporter.logfilewriter.interfaces;

public interface ILogFileWriter {
    void writeLogEntry(String entry);

    void rotateFile();

    void setOutputPath(String path);

    long getCurrentFileSize();
}
