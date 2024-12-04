package model;

public class Image {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Изображение изменено: " + state);
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Восстановлено состояние: " + state);
    }
}