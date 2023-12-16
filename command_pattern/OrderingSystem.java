import java.util.*;

public class OrderingSystem {
    private Queue<ICommand> commands;

    public OrderingSystem() {
        commands = new LinkedList<>();
    }

    public void addCommand(ICommand command) {
        commands.add(command);
    }

    public void executeCommand() {
        if (!commands.isEmpty()) {
            ICommand command = commands.poll(); // get and remove the next command
            command.execute(); // execute the command
        }
    }

    public void undoCommand() {
        if (!commands.isEmpty()) {
            ICommand command = commands.peek(); // get the last executed command
            command.undo(); // undo the command
        }
    }
}
