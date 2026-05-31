package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepmerger.stepbatchoptimizer.interfaces;

import java.util.List;

public interface IStepBatchOptimizer {
    List<String> optimize(List<String> batch);
    int estimateCost(List<String> batch);
    void setMaxBatchSize(int size);
    boolean shouldSplit(List<String> batch);
}
