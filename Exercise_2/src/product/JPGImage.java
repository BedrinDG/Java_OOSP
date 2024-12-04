package product;

public class JPGImage implements Image {
    @Override
    public void display() {
        System.out.println("Отображение изображения JPG.");
    }

    @Override
    public void save() {
        System.out.println("Сохранение изображения JPG.");
    }
}