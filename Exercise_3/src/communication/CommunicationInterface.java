package communication;

public interface CommunicationInterface {
    void connect();
    void disconnect();
    void sendCommand(String command);
}