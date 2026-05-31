package workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.messageencoder.msgformatpicker.impl;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import workspace.agentsystem.corelayer.coordinationplane.messagebus.publishservice.messageencoder.msgformatpicker.interfaces.IMsgFormatPicker;

public class MsgFormatPickerImpl implements IMsgFormatPicker {
    private final Set<String> formats = new CopyOnWriteArraySet<>();

    public String pickFormat(Object payload) {
        return getDefaultFormat();
    }

    public boolean supports(String format) {
        return formats.contains(format);
    }

    public void registerFormat(String format) {
        formats.add(format);
    }

    public String getDefaultFormat() {
        return "json";
    }
}
