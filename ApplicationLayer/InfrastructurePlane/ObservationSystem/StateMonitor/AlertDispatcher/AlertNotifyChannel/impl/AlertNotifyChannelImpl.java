package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.alertdispatcher.alertnotifychannel.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.alertdispatcher.alertnotifychannel.interfaces.IAlertNotifyChannel;

public class AlertNotifyChannelImpl implements IAlertNotifyChannel {
    @Override
    public void sendNotification(String alertId, String message) {
    }

    @Override
    public void setChannelConfig(String config) {
    }

    @Override
    public boolean isChannelAvailable() {
        return false;
    }

    @Override
    public String getChannelType() {
        return null;
    }
}
