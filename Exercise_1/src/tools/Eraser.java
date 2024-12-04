package tools;

import javax.swing.*;

public class Eraser implements Tool {
    @Override
    public void useTool(JTextArea display) {
        display.append("Стирание ластиком.\n");
    }
}