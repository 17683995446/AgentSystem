package agent.applicationlayer.infrastructureplane.memorysystem.longtermmemory.interfaces;

public interface ILongTermMemory {
    void persistMemory();
    void recallMemory();
    void forgetMemory();
    void indexMemory();
}
