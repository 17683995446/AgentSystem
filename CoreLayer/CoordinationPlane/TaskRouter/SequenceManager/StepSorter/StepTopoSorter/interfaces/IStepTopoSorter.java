package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepsorter.steptoposorter.interfaces;

import java.util.List;
import java.util.Map;

public interface IStepTopoSorter {
    List<String> sort(Map<String, List<String>> graph);
    boolean hasCycle(Map<String, List<String>> graph);
    List<String> getParallelGroups(Map<String, List<String>> graph);
    void setComparator(java.util.Comparator<String> comparator);
}
