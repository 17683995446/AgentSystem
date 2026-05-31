package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.recallengine.recallresultfilter.interfaces;

import java.util.List;

public interface IRecallResultFilter {
    List<String> filterByScore(List<String> results, double minScore);

    List<String> deduplicate(List<String> results);

    void setMinScore(double minScore);

    int getFilteredCount();
}
