public class AddItemCommand implements ICommand{
    private Order order;
    private MenuItem item;

    public AddItemCommand(Order order, MenuItem item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.addItem(item);
    }

    @Override
    public void undo() {
        order.removeItem(item);
    }
}
