import game.Character;
public class Main {
    public static void main(String[] args) {
        Character warrior = new Character("Воин", 100, 20, "Блок щита");
        System.out.println("Оригинальный персонаж: " + warrior);

        Character clonedWarrior = (Character) warrior.cloneCharacter();
        clonedWarrior.setName("Клонированный воин");
        clonedWarrior.setHealth(80);
        System.out.println("Клонированный персонаж: " + clonedWarrior);

        Character mage = new Character("Маг", 70, 25, "Огненный шар");
        System.out.println("Оригинальный персонаж: " + mage);

        Character clonedMage = (Character) mage.cloneCharacter();
        clonedMage.setName("Клонированный маг");
        clonedMage.setSpecialAbility("Ледяной взрыв");
        System.out.println("Клонированный персонаж: " + clonedMage);
    }
}