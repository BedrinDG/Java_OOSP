package communication;

public class BluetoothConnection implements CommunicationInterface {
    public void connect() {
        System.out.println("Подключение через Bluetooth...");
    }
    public void disconnect() {
        System.out.println("Отключение от Bluetooth...");
    }
    public void sendCommand(String command) {
        System.out.println("Команда по Bluetooth: " + command);
    }
}