package devicecontrol;

import communication.CommunicationInterface;

public class Robot extends DeviceControl {
    public Robot(CommunicationInterface communication) {
        super(communication);
    }

    public void start() {
        System.out.println("Робот запускается...");
        communication.connect();
    }

    public void stop() {
        System.out.println("Робот останавливается...");
        communication.disconnect();
    }

    public void sendOperation(String operation) {
        System.out.println("Робот выполняет операцию: " + operation);
        communication.sendCommand(operation);
    }
}