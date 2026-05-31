package agent.corelayer.coordinationplane.taskrouter.sequencemanager.stepsorter.interfaces;

public interface ISimpleStepSorter {
    void sortStepsByTime();
    void sortStepsByPriority();
    void reverseStepOrder();
    void groupStepsByTag();
    void shuffleStepBatch();
}
