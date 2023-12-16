import java.util.Collections;
import java.util.Set;

public class ModifyQuantityCommand implements ICommand {
    private Order order;
    private MenuItem item;
    private int quantity; // the new quantity of the item
    private int oldQuantity; // the old quantity of the item

    public ModifyQuantityCommand(Order order, MenuItem item, int quantity) {
        this.order = order;
        this.item = item;
        this.quantity = quantity;
        this.oldQuantity = 2;
    }

    public void execute() {
        order.modifyQuantity(item, quantity);
    }

    public void undo() {
        order.modifyQuantity(item, oldQuantity);
    }
}
