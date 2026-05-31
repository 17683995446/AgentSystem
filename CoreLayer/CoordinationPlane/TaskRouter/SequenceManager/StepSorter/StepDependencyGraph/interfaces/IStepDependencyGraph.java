package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepsorter.stepdependencygraph.interfaces;

import java.util.List;
import java.util.Map;

public interface IStepDependencyGraph {
    void addEdge(String from, String to);
    void removeEdge(String from, String to);
    List<String> getDependencies(String step);
    Map<String, List<String>> getGraph();
}
