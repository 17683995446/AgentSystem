package workspace.agentsystem.applicationlayer.agentexecutionplane.executionagents.dataprocessor.outputformatter.outputencoder.interfaces;

public interface IOutputEncoder {
    String encodeToJson(Object data);
    String encodeToXml(Object data);
    String encodeToBase64(String data);
    String encodeToCsv(Object[] rows);
}
