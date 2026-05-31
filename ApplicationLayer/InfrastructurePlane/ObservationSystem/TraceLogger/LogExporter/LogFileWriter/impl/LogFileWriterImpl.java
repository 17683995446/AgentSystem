package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logexporter.logfilewriter.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logexporter.logfilewriter.interfaces.ILogFileWriter;

public class LogFileWriterImpl implements ILogFileWriter {
    @Override
    public void writeLogEntry(String entry) {
    }

    @Override
    public void rotateFile() {
    }

    @Override
    public void setOutputPath(String path) {
    }

    @Override
    public long getCurrentFileSize() {
        return 0L;
    }
}
