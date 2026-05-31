package agent.corelayer.coordinationplane.messagebus.publishservice.messageencoder.interfaces;

public interface ISimpleMessageEncoder {
    void encodeMessageBody();
    void decodeMessageBody();
    void detectEncodingType();
    void compressMessageData();
    void verifyMessageChecksum();
}
