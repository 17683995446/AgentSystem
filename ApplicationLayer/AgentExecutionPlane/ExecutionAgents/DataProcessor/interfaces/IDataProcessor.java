package agent.applicationlayer.agentexecutionplane.executionagents.dataprocessor.interfaces;

public interface IDataProcessor {
    void parseInputData();
    void transformData();
    void validateData();
    void outputResult();
}
