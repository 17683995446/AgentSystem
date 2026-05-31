package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.messageencoder.msgformatpicker.interfaces;

public interface IMsgFormatPicker {
    String pickFormat(Object payload);
    boolean supports(String format);
    void registerFormat(String format);
    String getDefaultFormat();
}
