public class RemoveItemCommand implements ICommand{
    private Order order;
    private MenuItem item;

    public RemoveItemCommand(Order order, MenuItem item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.removeItem(item);
    }

    @Override
    public void undo() {
        order.addItem(item);
    }
}