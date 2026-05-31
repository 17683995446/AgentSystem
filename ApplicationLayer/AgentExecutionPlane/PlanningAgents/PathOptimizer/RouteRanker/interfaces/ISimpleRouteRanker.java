package agent.applicationlayer.agentexecutionplane.planningagents.pathoptimizer.routeranker.interfaces;

public interface ISimpleRouteRanker {
    void scoreEachRoute();
    void rankByScore();
    void filterTopRoutes();
    void selectBestRoute();
}
