package handlers;

public class XMLFileHandler {
    public void loadXML(String filePath) {
        System.out.println("Чтение данных из XML файла: " + filePath);
    }

    public void saveXML(String filePath, String data) {
        System.out.println("Запись данных в XML файл: " + filePath);
    }
}