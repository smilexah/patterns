package ConcreteStrategies.Shipping;

import Interfaces.ShippingStrategy;

public class BooksShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShipping(int quantity, double price) {
        double baseShippingCost = 5.0;
        double perBookShippingCost = 1.0;

        double totalShippingCost = baseShippingCost + (perBookShippingCost * quantity) + (0.1 * price);

        return totalShippingCost;
    }
}
