package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.outputformatter.outputtemplatemgr.impl;

import java.util.Map;
import workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.outputformatter.outputtemplatemgr.interfaces.IOutputTemplateMgr;

public class OutputTemplateMgrImpl implements IOutputTemplateMgr {
    @Override
    public String applyTemplate(String templateId, Map<String, Object> data) {
        return null;
    }

    @Override
    public boolean hasTemplate(String templateId) {
        return false;
    }

    @Override
    public void registerTemplate(String templateId, String template) {
    }

    @Override
    public String getTemplate(String templateId) {
        return null;
    }
}
