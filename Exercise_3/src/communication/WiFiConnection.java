package communication;

public class WiFiConnection implements CommunicationInterface {
    public void connect() {
        System.out.println("Подключение через Wi-Fi...");
    }
    public void disconnect() {
        System.out.println("Отключение от Wi-Fi...");
    }
    public void sendCommand(String command) {
        System.out.println("Команда по Wi-Fi: " + command);
    }
}