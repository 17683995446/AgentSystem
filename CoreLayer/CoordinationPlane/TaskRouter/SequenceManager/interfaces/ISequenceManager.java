package agent.corelayer.coordinationplane.taskrouter.sequencemanager.interfaces;

public interface ISequenceManager {
    void createSequence();
    void reorderSequence();
    void validateSequence();
    void executeSequence();
}
