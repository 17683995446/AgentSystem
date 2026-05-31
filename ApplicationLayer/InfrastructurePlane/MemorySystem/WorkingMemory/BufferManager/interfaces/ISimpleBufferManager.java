package agent.applicationlayer.infrastructureplane.memorysystem.workingmemory.buffermanager.interfaces;

public interface ISimpleBufferManager {
    void allocateBuffer();
    void releaseBuffer();
    void defragmentBuffer();
    void resizeBuffer();
}
