import ConcreteStrategies.Discount.BooksDiscountStrategy;
import ConcreteStrategies.Discount.ClothingDiscountStrategy;
import ConcreteStrategies.Discount.ElectronicDiscountStrategy;
import ConcreteStrategies.Pricing.BooksPricingStrategy;
import ConcreteStrategies.Pricing.ClothingPricingStrategy;
import ConcreteStrategies.Pricing.ElectronicPricingStrategy;
import ConcreteStrategies.Shipping.BooksShippingStrategy;
import ConcreteStrategies.Shipping.ClothingShippingStrategy;
import ConcreteStrategies.Shipping.ElectronicShippingStrategy;
import Interfaces.DiscountStrategy;
import Interfaces.PricingStrategy;
import Interfaces.ShippingStrategy;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new BooksDiscountStrategy();
        double discount = discountStrategy.calculateDiscount(6, 87.5);
        System.out.println("=================DISCOUNT=================");
        System.out.println("For books: " + discount);

        discountStrategy = new ClothingDiscountStrategy();
        discount = discountStrategy.calculateDiscount(10, 100);
        System.out.println("For clothing: " + discount);

        discountStrategy = new ElectronicDiscountStrategy();
        discount = discountStrategy.calculateDiscount(5, 293);
        System.out.println("For clothing: " + discount);

        PricingStrategy pricingStrategy = new BooksPricingStrategy();
        double price = pricingStrategy.calculatePrice(10, 100);
        System.out.println("=================PRICING=================");
        System.out.println("For books: " + price);

        pricingStrategy = new ClothingPricingStrategy();
        price = pricingStrategy.calculatePrice(10, 100);
        System.out.println("For clothing: " + price);

        pricingStrategy = new ElectronicPricingStrategy();
        price = pricingStrategy.calculatePrice(10, 100);
        System.out.println("For electronics: " + price);

        ShippingStrategy shippingStrategy = new BooksShippingStrategy();
        double shippingCost = shippingStrategy.calculateShipping(10, 100);
        System.out.println("=================SHIPPING=================");
        System.out.println("For books: " + shippingCost);

        shippingStrategy = new ClothingShippingStrategy();
        shippingCost = shippingStrategy.calculateShipping(10, 100);
        System.out.println("For clothing: " + shippingCost);

        shippingStrategy = new ElectronicShippingStrategy();
        shippingCost = shippingStrategy.calculateShipping(10, 100);
        System.out.println("For electronics: " + shippingCost);
    }
}
