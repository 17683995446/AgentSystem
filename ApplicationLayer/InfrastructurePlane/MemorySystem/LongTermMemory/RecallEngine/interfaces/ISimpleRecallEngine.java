package agent.applicationlayer.infrastructureplane.memorysystem.longtermmemory.recallengine.interfaces;

public interface ISimpleRecallEngine {
    void searchMemoryIndex();
    void rankRecallResults();
    void filterRecallResults();
    void returnTopResults();
}
