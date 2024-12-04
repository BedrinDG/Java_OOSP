package devicecontrol;

import communication.CommunicationInterface;

public class Drone extends DeviceControl {
    public Drone(CommunicationInterface communication) {
        super(communication);
    }

    public void start() {
        System.out.println("Дрон взлетает...");
        communication.connect();
    }

    public void stop() {
        System.out.println("Дрон приземляется...");
        communication.disconnect();
    }

    public void sendOperation(String operation) {
        System.out.println("Дрон выполняет операцию: " + operation);
        communication.sendCommand(operation);
    }
}