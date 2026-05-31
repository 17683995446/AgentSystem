package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.routeranker.routefilterengine.interfaces;

import java.util.List;

public interface IRouteFilterEngine {
    List<String> filterByThreshold(List<String> routes, double minScore);
    List<String> filterByConstraint(List<String> routes, String constraint);
    List<String> topRoutes(List<String> routes, int limit);
    boolean isQualified(String routeId, String criteria);
}
