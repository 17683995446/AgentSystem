package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepmerger.stepbatchoptimizer.impl;

import java.util.List;
import java.util.ArrayList;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepmerger.stepbatchoptimizer.interfaces.IStepBatchOptimizer;

public class StepBatchOptimizerImpl implements IStepBatchOptimizer {
    private int maxBatchSize = 100;

    public List<String> optimize(List<String> batch) {
        return new ArrayList<>(batch);
    }

    public int estimateCost(List<String> batch) {
        return batch.size();
    }

    public void setMaxBatchSize(int size) {
        this.maxBatchSize = size;
    }

    public boolean shouldSplit(List<String> batch) {
        return batch.size() > maxBatchSize;
    }
}
