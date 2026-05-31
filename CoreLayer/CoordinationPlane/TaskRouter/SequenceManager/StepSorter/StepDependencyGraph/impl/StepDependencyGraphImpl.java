package workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepsorter.stepdependencygraph.impl;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import workspace.agentsystem.corelayer.coordinationplane.taskrouter.sequencemanager.stepsorter.stepdependencygraph.interfaces.IStepDependencyGraph;

public class StepDependencyGraphImpl implements IStepDependencyGraph {
    private final Map<String, List<String>> graph = new ConcurrentHashMap<>();

    public void addEdge(String from, String to) {
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
    }

    public void removeEdge(String from, String to) {
        graph.getOrDefault(from, new ArrayList<>()).remove(to);
    }

    public List<String> getDependencies(String step) {
        return graph.getOrDefault(step, new ArrayList<>());
    }

    public Map<String, List<String>> getGraph() {
        return new ConcurrentHashMap<>(graph);
    }
}
