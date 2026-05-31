package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.buffermanager.bufferpoolmgr.interfaces;

public interface IBufferPoolMgr {
    void allocateBuffer(String bufferId, int size);

    void releaseBuffer(String bufferId);

    int getAvailableCapacity();

    void resizeBuffer(String bufferId, int newSize);
}
