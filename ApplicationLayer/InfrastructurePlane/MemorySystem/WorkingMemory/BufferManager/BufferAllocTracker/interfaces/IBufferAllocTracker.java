package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.buffermanager.bufferalloctracker.interfaces;

public interface IBufferAllocTracker {
    void recordAllocation(String bufferId, int size);

    void recordDeallocation(String bufferId);

    int getTotalAllocated();

    void printAllocReport();
}
