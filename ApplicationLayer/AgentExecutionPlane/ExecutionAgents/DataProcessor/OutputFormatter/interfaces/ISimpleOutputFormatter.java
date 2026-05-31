package agent.applicationlayer.agentexecutionplane.executionagents.dataprocessor.outputformatter.interfaces;

public interface ISimpleOutputFormatter {
    void formatOutputData();
    void applyOutputStyle();
    void wrapOutputBlock();
    void encodeOutputStream();
}
