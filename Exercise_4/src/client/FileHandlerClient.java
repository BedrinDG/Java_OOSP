package client;

import adapters.*;
import handlers.*;
import interfaces.FileReaderWriter;

public class FileHandlerClient {
    public static void main(String[] args) {
        FileReaderWriter csvAdapter = new CSVAdapter(new CSVFileHandler());
        FileReaderWriter jsonAdapter = new JSONAdapter(new JSONFileHandler());
        FileReaderWriter xmlAdapter = new XMLAdapter(new XMLFileHandler());

        // Чтение и запись через адаптеры
        csvAdapter.readData("data.csv");
        csvAdapter.writeData("data.csv", "CSV data");

        jsonAdapter.readData("data.json");
        jsonAdapter.writeData("data.json", "JSON data");

        xmlAdapter.readData("data.xml");
        xmlAdapter.writeData("data.xml", "XML data");
    }
}