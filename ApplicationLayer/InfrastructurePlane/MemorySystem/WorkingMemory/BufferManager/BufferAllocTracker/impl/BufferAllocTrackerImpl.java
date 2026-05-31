package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.buffermanager.bufferalloctracker.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.buffermanager.bufferalloctracker.interfaces.IBufferAllocTracker;

public class BufferAllocTrackerImpl implements IBufferAllocTracker {
    @Override
    public void recordAllocation(String bufferId, int size) {
    }

    @Override
    public void recordDeallocation(String bufferId) {
    }

    @Override
    public int getTotalAllocated() {
        return 0;
    }

    @Override
    public void printAllocReport() {
    }
}
