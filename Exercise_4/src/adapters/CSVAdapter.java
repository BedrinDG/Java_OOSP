package adapters;

import handlers.CSVFileHandler;
import interfaces.FileReaderWriter;

public class CSVAdapter implements FileReaderWriter {
    private final CSVFileHandler csvHandler;

    public CSVAdapter(CSVFileHandler csvHandler) {
        this.csvHandler = csvHandler;
    }

    @Override
    public void readData(String filePath) {
        csvHandler.loadCSV(filePath);
    }

    @Override
    public void writeData(String filePath, String data) {
        csvHandler.saveCSV(filePath, data);
    }
}