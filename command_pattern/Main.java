public class Main {
    public static void main(String[] args) {
        // Create some menu items
        MenuItem pizza = new MenuItem("Pizza", "Cheese and tomato sauce on a crust", 10.99);
        MenuItem burger = new MenuItem("Burger", "Beef patty with lettuce and tomato on a bun", 8.99);
        MenuItem salad = new MenuItem("Salad", "Fresh greens with dressing", 6.99);

        // Create an order
        Order order = new Order();

        // Create some command objects for adding/removing/modifying items in the order
        ICommand addPizza = new AddItemCommand(order, pizza);
        ICommand addBurger = new AddItemCommand(order, burger);
        ICommand addSalad = new AddItemCommand(order, salad);
        ICommand removePizza = new RemoveItemCommand(order, pizza);
        ICommand modifySalad = new ModifyQuantityCommand(order, salad, 2);

        OrderingSystem system = new OrderingSystem();

        // Add the commands to the ordering system queue
        system.addCommand(addPizza);
        system.addCommand(addBurger);
        system.addCommand(addSalad);
        system.addCommand(removePizza);
        system.addCommand(modifySalad);

        // Execute the commands in the queue
        system.executeCommand(); // add pizza
        system.executeCommand(); // add burger
        system.executeCommand(); // add salad
        system.executeCommand(); // remove pizza
        system.executeCommand(); // modify salad

        // Print the order
        System.out.println(order);

        // Undo the last executed command
        system.undoCommand(); // undo modify salad

        // Print the order again
        System.out.println(order);
    }
}
