package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.goalparser.goalnodebuilder.interfaces;

import java.util.List;

public interface IGoalNodeBuilder {
    Object buildNode(String token);
    List<Object> buildTree(List<String> tokens);
    void attachMetadata(Object node, String key, Object value);
    Object optimizeTree(Object root);
}
