package ConcreteStrategies.Pricing;

import Interfaces.PricingStrategy;

public class ElectronicPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(int quantity, double price) {
        if (quantity >= 5) {
            double discount = 0.05;
            return quantity * price * (1 - discount);
        } else {
            return quantity * price;
        }
    }
}
