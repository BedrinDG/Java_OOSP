package devicecontrol;

import communication.CommunicationInterface;

public abstract class DeviceControl {
    protected CommunicationInterface communication;

    public DeviceControl(CommunicationInterface communication) {
        this.communication = communication;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void sendOperation(String operation);
}