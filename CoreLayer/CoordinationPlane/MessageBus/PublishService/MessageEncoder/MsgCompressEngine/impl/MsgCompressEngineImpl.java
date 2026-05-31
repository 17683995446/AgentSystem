package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.messageencoder.msgcompressengine.impl;

import workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.messageencoder.msgcompressengine.interfaces.IMsgCompressEngine;

public class MsgCompressEngineImpl implements IMsgCompressEngine {
    public byte[] compress(byte[] data) {
        return data;
    }

    public byte[] decompress(byte[] data) {
        return data;
    }

    public String getAlgorithm() {
        return "gzip";
    }

    public int getCompressionLevel() {
        return 5;
    }
}
