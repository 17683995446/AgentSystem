package agent.corelayer.coordinationplane.taskrouter.sequencemanager.stepmerger.interfaces;

public interface ISimpleStepMerger {
    void mergeAdjacentSteps();
    void splitMergedChunk();
    void detectMergeConflict();
    void commitMergeResult();
    void abortMergeAction();
}
