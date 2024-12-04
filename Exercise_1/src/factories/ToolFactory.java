package factories;

import tools.Tool;

public abstract class ToolFactory {
    public abstract Tool createTool(String toolType);
}