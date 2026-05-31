package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepsorter.steptoposorter.impl;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepsorter.steptoposorter.interfaces.IStepTopoSorter;

public class StepTopoSorterImpl implements IStepTopoSorter {
    private Comparator<String> comparator;

    public List<String> sort(Map<String, List<String>> graph) {
        return new ArrayList<>(graph.keySet());
    }

    public boolean hasCycle(Map<String, List<String>> graph) {
        return false;
    }

    public List<String> getParallelGroups(Map<String, List<String>> graph) {
        return new ArrayList<>(graph.keySet());
    }

    public void setComparator(Comparator<String> comparator) {
        this.comparator = comparator;
    }
}
