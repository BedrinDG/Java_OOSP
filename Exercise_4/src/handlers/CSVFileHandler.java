package handlers;

public class CSVFileHandler {
    public void loadCSV(String filePath) {
        System.out.println("Чтение данных из CSV файла: " + filePath);
    }

    public void saveCSV(String filePath, String data) {
        System.out.println("Запись данных в CSV файл: " + filePath);
    }
}