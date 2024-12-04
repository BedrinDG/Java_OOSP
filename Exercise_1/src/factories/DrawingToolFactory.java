package factories;

import tools.Tool;
import tools.Brush;
import tools.Eraser;
import tools.Pencil;

public class DrawingToolFactory extends ToolFactory {
    @Override
    public Tool createTool(String toolType) {
        return switch (toolType) {
            case "карандаш" -> new Pencil();
            case "кисть" -> new Brush();
            case "резинка" -> new Eraser();
            default -> throw new IllegalArgumentException("Неизвестный тип инструмента: " + toolType);
        };
    }
}