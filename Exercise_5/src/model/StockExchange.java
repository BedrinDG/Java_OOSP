package model;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private final List<Stock> stocks = new ArrayList<>();

    private static class Stock {
        private final String name;
        private double price;

        public Stock(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String companyName, double newPrice) {
        for (Observer observer : observers) {
            observer.update(companyName, newPrice);
        }
    }

    public void addStock(String name, double price) {
        stocks.add(new Stock(name, price));
    }

    public void updateStockPrice(String companyName, double newPrice) {
        for (Stock stock : stocks) {
            if (stock.getName().equals(companyName)) {
                stock.setPrice(newPrice);
                notifyObservers(companyName, newPrice);
                break;
            }
        }
    }
}