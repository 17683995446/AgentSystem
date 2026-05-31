package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.inputsanitizer.inputnormalizer.interfaces;

public interface IInputNormalizer {
    String trimWhitespace(String input);
    String normalizeCase(String input);
    String escapeSpecialChars(String input);
    String standardizeEncoding(String input);
}
