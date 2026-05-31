package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.goalparser.goalinputlexer.impl;

import java.util.List;
import workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.goalparser.goalinputlexer.interfaces.IGoalInputLexer;

public class GoalInputLexerImpl implements IGoalInputLexer {
    @Override
    public List<String> tokenize(String rawInput) {
        return null;
    }

    @Override
    public String classifyToken(String token) {
        return null;
    }

    @Override
    public boolean validateSyntax(List<String> tokens) {
        return false;
    }

    @Override
    public List<String> extractKeywords(String rawInput) {
        return null;
    }
}
