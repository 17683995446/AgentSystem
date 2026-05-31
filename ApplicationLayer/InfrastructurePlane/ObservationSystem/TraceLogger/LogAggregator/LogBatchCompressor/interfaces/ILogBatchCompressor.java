package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.tracelogger.logaggregator.logbatchcompressor.interfaces;

public interface ILogBatchCompressor {
    byte[] compressBatch(byte[] batchData);

    byte[] decompressBatch(byte[] compressedData);

    void setCompressionLevel(int level);

    String getCompressionAlgorithm();
}
