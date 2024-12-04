package car;

public class CarBuilder {
    private String brand;
    private String model;
    private String color;
    private String[] options;

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setOptions(String... options) {
        this.options = options;
        return this;
    }

    public Car build() {
        return new Car(brand, model, color, options);
    }
}