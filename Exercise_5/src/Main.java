import investor.Investor;
import model.StockExchange;

public class Main {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        stockExchange.addStock("Apple", 150.0);
        stockExchange.addStock("Google", 2800.0);

        Investor investor1 = new Investor("Алексей");
        Investor investor2 = new Investor("Мария");

        stockExchange.addObserver(investor1);
        stockExchange.addObserver(investor2);

        stockExchange.updateStockPrice("Apple", 155.0);
        stockExchange.removeObserver(investor1);
        stockExchange.updateStockPrice("Google", 2900.0);
    }
}