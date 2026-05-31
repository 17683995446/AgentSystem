package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.outputformatter.outputtemplatemgr.interfaces;

import java.util.Map;

public interface IOutputTemplateMgr {
    String applyTemplate(String templateId, Map<String, Object> data);
    boolean hasTemplate(String templateId);
    void registerTemplate(String templateId, String template);
    String getTemplate(String templateId);
}
