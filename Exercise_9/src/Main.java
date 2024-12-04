public class Main {
    public static void main(String[] args) {
        EventLogger logger = EventLogger.getInstance();
        logger.logEvent("Программа запущена");
        logger.logEvent("Произошло важное событие");
        logger.logEvent("Программа завершена");

        System.out.println("События записаны в лог.");
    }
}
