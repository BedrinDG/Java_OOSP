package investor;

import observer.Observer;

public class Investor implements Observer {
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String companyName, double newPrice) {
        System.out.println("Инвестор " + name + " получил уведомление: Акция компании " + companyName + " изменила цену на " + newPrice);
    }
}