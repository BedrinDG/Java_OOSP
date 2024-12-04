import animations.*;

public class Main {
    public static void main(String[] args) {
        Animation move = new MoveAnimation();
        Animation rotate = new RotateAnimation();
        Animation scale = new ScaleAnimation();

        System.out.println("Запуск анимаций:");
        move.playAnimation();
        rotate.playAnimation();
        scale.playAnimation();
    }
}