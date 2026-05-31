package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.alertdispatcher.alertnotifychannel.interfaces;

public interface IAlertNotifyChannel {
    void sendNotification(String alertId, String message);

    void setChannelConfig(String config);

    boolean isChannelAvailable();

    String getChannelType();
}
