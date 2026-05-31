package agent.corelayer.coordinationplane.messagebus.subscribeservice.interfaces;

public interface ISubscribeService {
    void subscribeTopic();
    void unsubscribeTopic();
    void receiveMessage();
    void filterMessage();
}
