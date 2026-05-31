package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logaggregator.logbatchcompressor.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logaggregator.logbatchcompressor.interfaces.ILogBatchCompressor;

public class LogBatchCompressorImpl implements ILogBatchCompressor {
    @Override
    public byte[] compressBatch(byte[] batchData) {
        return null;
    }

    @Override
    public byte[] decompressBatch(byte[] compressedData) {
        return null;
    }

    @Override
    public void setCompressionLevel(int level) {
    }

    @Override
    public String getCompressionAlgorithm() {
        return null;
    }
}
