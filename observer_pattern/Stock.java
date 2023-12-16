import java.util.*;

public class Stock {
    private String symbol;

    private float price;

    private List<Investor> investors;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
        this.investors = new ArrayList<>();
    }

    public void registerInvestor(Subscriber investor) {
        investors.add((Investor) investor);
    }

    public void unregisterInvestor(Subscriber investor) {
        investors.remove((Investor) investor);
    }

    public void updatePrice(float price) {
        this.price = price;
        for (Investor investor : investors) {
            investor.update(this);
        }
    }

    // Getters and Setters
    public List<Investor> getInvestors() {
        return investors;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getPrice() {
        return price;
    }
}