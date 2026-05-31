package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.messageencoder.msgcompressengine.interfaces;

public interface IMsgCompressEngine {
    byte[] compress(byte[] data);
    byte[] decompress(byte[] data);
    String getAlgorithm();
    int getCompressionLevel();
}
