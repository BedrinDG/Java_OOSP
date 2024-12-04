import devicecontrol.*;
import communication.*;

public class Main {
    public static void main(String[] args) {
        CommunicationInterface wifi = new WiFiConnection();
        CommunicationInterface bluetooth = new BluetoothConnection();

        DeviceControl robot = new Robot(wifi);
        DeviceControl drone = new Drone(bluetooth);
        DeviceControl car = new Car(wifi);

        robot.start();
        robot.sendOperation("Движение вперед");
        robot.stop();

        drone.start();
        drone.sendOperation("Взлет на высоту 10 метров");
        drone.stop();

        car.start();
        car.sendOperation("Поездка на 50 км");
        car.stop();
    }
}