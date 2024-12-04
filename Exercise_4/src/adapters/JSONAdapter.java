package adapters;

import handlers.JSONFileHandler;
import interfaces.FileReaderWriter;

public class JSONAdapter implements FileReaderWriter {
    private final JSONFileHandler jsonHandler;

    public JSONAdapter(JSONFileHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    @Override
    public void readData(String filePath) {
        jsonHandler.loadJSON(filePath);
    }

    @Override
    public void writeData(String filePath, String data) {
        jsonHandler.saveJSON(filePath, data);
    }
}