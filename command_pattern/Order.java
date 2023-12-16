import java.util.*;

public class Order {
    private List<MenuItem> items;
    private double total;

    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        total += item.getPrice();
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        total -= item.getPrice();
    }

    public void getItems() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void modifyQuantity(MenuItem item, int quantity) {
        int index = items.indexOf(item);
        int oldQuantity = Collections.frequency(items, item);

        for (int i = 0; i < oldQuantity; i++) {
            items.remove(index);
        }
        for (int i = 0; i < quantity; i++) {
            items.add(index, item);
        }
        
        total += (quantity - oldQuantity) * item.getPrice();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order:\n");
        for (MenuItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total: $" + total);
        return sb.toString();
    }
}
