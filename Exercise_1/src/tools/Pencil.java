package tools;

import javax.swing.*;

public class Pencil implements Tool {
    @Override
    public void useTool(JTextArea display) {
        display.append("Рисование карандашом.\n");
    }
}