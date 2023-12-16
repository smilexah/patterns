package ConcreteStrategies.Discount;

import Interfaces.DiscountStrategy;

public class BooksDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(int quantity, double price) {
        // Apply a 10% discount if the quantity is greater than 5
        if (quantity >= 5) {
            return price - (price * 0.10);
        } else {
            return price;
        }
    }
}