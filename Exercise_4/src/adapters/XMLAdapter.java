package adapters;

import handlers.XMLFileHandler;
import interfaces.FileReaderWriter;

public class XMLAdapter implements FileReaderWriter {
    private final XMLFileHandler xmlHandler;

    public XMLAdapter(XMLFileHandler xmlHandler) {
        this.xmlHandler = xmlHandler;
    }

    @Override
    public void readData(String filePath) {
        xmlHandler.loadXML(filePath);
    }

    @Override
    public void writeData(String filePath, String data) {
        xmlHandler.saveXML(filePath, data);
    }
}