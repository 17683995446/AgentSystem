package agent.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.goalparser.interfaces;

public interface ISimpleGoalParser {
    void parseGoalInput();
    void extractGoalParams();
    void validateGoalSyntax();
    void buildGoalTree();
}
