package factory;

import product.GIFImage;
import product.Image;

public class GIFFactory implements ImageFactory {
    @Override
    public Image createImage() {
        return new GIFImage();
    }
}