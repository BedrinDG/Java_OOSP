package car;

public class Car {
    private String brand;
    private String model;
    private String color;
    private String[] options;

    public Car(String brand, String model, String color, String[] options) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.options = options;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String[] getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand='" + brand + "'" +
                ", model='" + model + "'" +
                ", color='" + color + "'" +
                ", options=[" + String.join(", ", options) + "]";
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }
}