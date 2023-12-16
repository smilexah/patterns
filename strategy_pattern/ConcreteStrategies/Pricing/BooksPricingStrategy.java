package ConcreteStrategies.Pricing;

import Interfaces.PricingStrategy;

public class BooksPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(int quantity, double price) {
        if (quantity >= 5) {
            double discount = 0.10;
            return quantity * price * (1 - discount);
        } else {
            return quantity * price;
        }
    }
}
