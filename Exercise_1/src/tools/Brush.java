package tools;

import javax.swing.*;

public class Brush implements Tool {
    @Override
    public void useTool(JTextArea display) {
        display.append("Рисование кистью.\n");
    }
}