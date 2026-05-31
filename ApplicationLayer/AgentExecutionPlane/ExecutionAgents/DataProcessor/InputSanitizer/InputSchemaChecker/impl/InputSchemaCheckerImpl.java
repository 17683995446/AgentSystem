package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.inputsanitizer.inputschemachecker.impl;

import workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.inputsanitizer.inputschemachecker.interfaces.IInputSchemaChecker;

public class InputSchemaCheckerImpl implements IInputSchemaChecker {
    @Override
    public boolean checkRequiredFields(Object input, String schemaId) {
        return false;
    }

    @Override
    public boolean checkFieldTypes(Object input, String schemaId) {
        return false;
    }

    @Override
    public String getSchemaErrors(Object input, String schemaId) {
        return null;
    }

    @Override
    public boolean validateFormat(String fieldValue, String format) {
        return false;
    }
}
