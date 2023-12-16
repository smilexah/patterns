package ConcreteStrategies.Discount;

import Interfaces.DiscountStrategy;

public class ClothingDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(int quantity, double price) {
        if (quantity > 5 && price >= 100) {
            return price - (price * 0.10);
        } else
            return price;
    }
}
