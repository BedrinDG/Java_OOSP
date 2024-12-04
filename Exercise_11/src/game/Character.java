package game;

public class Character implements GameCharacter {
    private String name;
    private int health;
    private int attackPower;
    private String specialAbility;

    public Character(String name, int health, int attackPower, String specialAbility) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.specialAbility = specialAbility;
    }

    // Метод клонирования
    @Override
    public GameCharacter cloneCharacter() {
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонирование не поддерживается для этого персонажа");
        }
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    @Override
    public String toString() {
        return "Персонаж{" +
                "Имя='" + name + '\'' +
                ", Здоровье=" + health +
                ", Сила атаки=" + attackPower +
                ", Особые навыки='" + specialAbility + '\'' +
                '}';
    }
}