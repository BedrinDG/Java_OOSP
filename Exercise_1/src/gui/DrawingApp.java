package gui;

import factories.ToolFactory;
import factories.DrawingToolFactory;
import tools.Tool;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class DrawingApp {
    public static void main(String[] args) {
        ToolFactory toolFactory = new DrawingToolFactory();

        JFrame frame = new JFrame("Приложение для рисования");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel toolPanel = new JPanel();
        JButton pencilButton = new JButton("Карандаш");
        JButton brushButton = new JButton("Кисть");
        JButton eraserButton = new JButton("Резинка");

        toolPanel.add(pencilButton);
        toolPanel.add(brushButton);
        toolPanel.add(eraserButton);

        JTextArea display = new JTextArea(10, 30);
        display.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(display);

        pencilButton.addActionListener(e -> {
            Tool pencil = toolFactory.createTool("карандаш");
            pencil.useTool(display);
        });

        brushButton.addActionListener(e -> {
            Tool brush = toolFactory.createTool("кисть");
            brush.useTool(display);
        });

        eraserButton.addActionListener(e -> {
            Tool eraser = toolFactory.createTool("резинка");
            eraser.useTool(display);
        });

        frame.add(toolPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}