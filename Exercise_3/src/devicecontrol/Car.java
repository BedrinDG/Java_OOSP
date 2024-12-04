package devicecontrol;

import communication.CommunicationInterface;

public class Car extends DeviceControl {
    public Car(CommunicationInterface communication) {
        super(communication);
    }
    @Override
    public void start() {
        System.out.println("Автомобиль запускается...");
        communication.connect();
    }
    @Override
    public void stop() {
        System.out.println("Автомобиль останавливается...");
        communication.disconnect();
    }
    @Override
    public void sendOperation(String operation) {
        System.out.println("Автомобиль выполняет операцию: " + operation);
        communication.sendCommand(operation);
    }
}