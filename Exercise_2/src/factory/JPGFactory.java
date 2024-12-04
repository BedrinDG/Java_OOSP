package factory;

import product.Image;
import product.JPGImage;

public class JPGFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new JPGImage();
    }
}