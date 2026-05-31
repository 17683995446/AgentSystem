package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepmerger.stepbatchcollector.impl;

import java.util.List;
import java.util.ArrayList;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepmerger.stepbatchcollector.interfaces.IStepBatchCollector;

public class StepBatchCollectorImpl implements IStepBatchCollector {
    private final List<String> batch = new ArrayList<>();

    public void collect(String step) {
        batch.add(step);
    }

    public List<String> getBatch() {
        return new ArrayList<>(batch);
    }

    public void clearBatch() {
        batch.clear();
    }

    public int getBatchSize() {
        return batch.size();
    }
}
