package product;

public class PNGImage implements Image {
    @Override
    public void display() {
        System.out.println("Отображение изображения PNG.");
    }

    @Override
    public void save() {
        System.out.println("Сохранение изображения PNG.");
    }
}