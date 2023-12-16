import java.util.*;

public class Investor implements Subscriber {
    private String name;
    private List<Stock> stocks = new ArrayList<Stock>();

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Notified " + name + " of " + stock.getSymbol() + "'s change to " + stock.getPrice());
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// it's like a ConcreteSub