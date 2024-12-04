import model.Caretaker;
import model.Image;
public class Main {
        public static void main(String[] args) {
            Image image = new Image();
            Caretaker caretaker = new Caretaker();

            image.setState("Фильтр: Чёрно-белый");
            caretaker.save(image.saveStateToMemento());

            image.setState("Фильтр: Сепия");
            caretaker.save(image.saveStateToMemento());

            image.setState("Эффект: Размытие");

            System.out.println("\nОтмена изменений:");
            image.restoreStateFromMemento(caretaker.undo());
            image.restoreStateFromMemento(caretaker.undo());
        }
}