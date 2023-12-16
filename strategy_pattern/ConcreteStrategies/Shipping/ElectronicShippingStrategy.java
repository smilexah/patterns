package ConcreteStrategies.Shipping;

import Interfaces.ShippingStrategy;

public class ElectronicShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateShipping(int quantity, double price) {
        double baseShippingCost = 7.0;
        double perItemShippingCost = 2.0;

        double totalShippingCost = baseShippingCost + (perItemShippingCost * quantity) + (0.1 * price);

        return totalShippingCost;
    }
}
