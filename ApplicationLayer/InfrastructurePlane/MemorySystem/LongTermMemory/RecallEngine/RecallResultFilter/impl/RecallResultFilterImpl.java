package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.recallengine.recallresultfilter.impl;

import java.util.List;
import workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.recallengine.recallresultfilter.interfaces.IRecallResultFilter;

public class RecallResultFilterImpl implements IRecallResultFilter {
    @Override
    public List<String> filterByScore(List<String> results, double minScore) {
        return null;
    }

    @Override
    public List<String> deduplicate(List<String> results) {
        return null;
    }

    @Override
    public void setMinScore(double minScore) {
    }

    @Override
    public int getFilteredCount() {
        return 0;
    }
}
