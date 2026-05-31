package agent.applicationlayer.infrastructureplane.memorysystem.workingmemory.interfaces;

public interface IWorkingMemory {
    void storeContext();
    void retrieveContext();
    void clearContext();
    void updateContext();
}
