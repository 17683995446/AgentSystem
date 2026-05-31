package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.inputsanitizer.inputschemachecker.interfaces;

public interface IInputSchemaChecker {
    boolean checkRequiredFields(Object input, String schemaId);
    boolean checkFieldTypes(Object input, String schemaId);
    String getSchemaErrors(Object input, String schemaId);
    boolean validateFormat(String fieldValue, String format);
}
