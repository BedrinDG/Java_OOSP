package animations;

public abstract class Animation {
    public final void playAnimation() {
        initialize();
        update();
        finish();
    }

    private void initialize() {
        System.out.println("Инициализация анимации...");
    }

    protected abstract void update();

    private void finish() {
        System.out.println("Завершение анимации.\n");
    }
}