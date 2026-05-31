package agent.corelayer.coordinationplane.messagebus.publishservice.interfaces;

public interface IPublishService {
    void publishMessage();
    void broadcastMessage();
    void validateMessage();
    void routeMessage();
}
