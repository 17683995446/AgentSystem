package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.goalparser.goalinputlexer.interfaces;

import java.util.List;

public interface IGoalInputLexer {
    List<String> tokenize(String rawInput);
    String classifyToken(String token);
    boolean validateSyntax(List<String> tokens);
    List<String> extractKeywords(String rawInput);
}
