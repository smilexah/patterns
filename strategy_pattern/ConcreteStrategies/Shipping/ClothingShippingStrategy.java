package ConcreteStrategies.Shipping;

import Interfaces.ShippingStrategy;

public class ClothingShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShipping(int quantity, double price) {
        double baseShippingCost = 3.0;
        double perItemShippingCost = 0.5;

        double totalShippingCost = baseShippingCost + (perItemShippingCost * quantity) + (0.05 * price);

        return totalShippingCost;
    }
}
