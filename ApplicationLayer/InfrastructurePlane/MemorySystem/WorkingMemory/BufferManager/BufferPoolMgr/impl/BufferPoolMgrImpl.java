package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.buffermanager.bufferpoolmgr.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.buffermanager.bufferpoolmgr.interfaces.IBufferPoolMgr;

public class BufferPoolMgrImpl implements IBufferPoolMgr {
    @Override
    public void allocateBuffer(String bufferId, int size) {
    }

    @Override
    public void releaseBuffer(String bufferId) {
    }

    @Override
    public int getAvailableCapacity() {
        return 0;
    }

    @Override
    public void resizeBuffer(String bufferId, int newSize) {
    }
}
