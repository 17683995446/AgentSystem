package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepmerger.stepbatchcollector.interfaces;

import java.util.List;

public interface IStepBatchCollector {
    void collect(String step);
    List<String> getBatch();
    void clearBatch();
    int getBatchSize();
}
