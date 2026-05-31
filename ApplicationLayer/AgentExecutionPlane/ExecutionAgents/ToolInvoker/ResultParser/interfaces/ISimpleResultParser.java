package agent.applicationlayer.agentexecutionplane.executionagents.toolinvoker.resultparser.interfaces;

public interface ISimpleResultParser {
    void parseRawResult();
    void extractResultData();
    void validateResultFormat();
    void convertResultType();
}
