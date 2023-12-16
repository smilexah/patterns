package ConcreteStrategies.Discount;

import Interfaces.DiscountStrategy;

public class ElectronicDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(int quantity, double price) {
        if (quantity >= 5 && price >= 250) {
            return price - (price * 0.15);
        } else {
            return price;
        }
    }
}
