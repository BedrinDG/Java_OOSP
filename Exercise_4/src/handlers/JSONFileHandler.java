package handlers;

public class JSONFileHandler {
    public void loadJSON(String filePath) {
        System.out.println("Чтение данных из JSON файла: " + filePath);
    }

    public void saveJSON(String filePath, String data) {
        System.out.println("Запись данных в JSON файл: " + filePath);
    }
}