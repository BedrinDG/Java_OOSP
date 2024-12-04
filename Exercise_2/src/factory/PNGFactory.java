package factory;

import product.Image;
import product.PNGImage;

public class PNGFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new PNGImage();
    }
}