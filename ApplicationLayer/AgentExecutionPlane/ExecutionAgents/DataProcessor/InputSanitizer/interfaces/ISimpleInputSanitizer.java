package agent.applicationlayer.agentexecutionplane.executionagents.dataprocessor.inputsanitizer.interfaces;

public interface ISimpleInputSanitizer {
    void trimInputData();
    void escapeSpecialChars();
    void checkInputLength();
    void validateInputType();
}
