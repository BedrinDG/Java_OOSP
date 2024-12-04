package product;

public class GIFImage implements Image {
    @Override
    public void display() {
        System.out.println("Отображение GIF-изображения.");
    }

    @Override
    public void save() {
        System.out.println("Сохранение GIF-изображения.");
    }
}