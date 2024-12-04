import editor.GraphicEditor;

import factory.*;

public class Main {
    public static void main(String[] args) {
        ImageFactory jpgFactory = new JPGFactory();
        GraphicEditor editor = new GraphicEditor(jpgFactory);
        editor.openImage();
        editor.saveImage();

        ImageFactory pngFactory = new PNGFactory();
        editor = new GraphicEditor(pngFactory);
        editor.openImage();
        editor.saveImage();

        ImageFactory gifFactory = new GIFFactory();
        editor = new GraphicEditor(gifFactory);
        editor.openImage();
        editor.saveImage();
    }
}