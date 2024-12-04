import car.Car;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .setBrand("Tesla")
                .setModel("Model S")
                .setColor("Белый")
                .setOptions("Автопилот", "Стеклянная крыша")
                .build();

        System.out.println(car);
    }
}