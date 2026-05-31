package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.routeranker.routescorecalc.interfaces;

import java.util.Map;

public interface IRouteScoreCalc {
    double calculateScore(String routeId);
    Map<String, Double> scoreComponents(String routeId);
    double normalizeScore(double rawScore);
    double combineScores(Map<String, Double> weights);
}
