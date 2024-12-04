package editor;

import factory.ImageFactory;
import product.Image;

public class GraphicEditor {
    private final ImageFactory factory;

    public GraphicEditor(ImageFactory factory) {
        this.factory = factory;
    }

    public void openImage() {
        Image image = factory.createImage();
        image.display();
    }

    public void saveImage() {
        Image image = factory.createImage();
        image.save();
    }
}
