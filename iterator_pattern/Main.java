public class Main {
    public static void main(String[] args) {
//        Stack: First In Last Out (FILO): The first object or item in a stack is the last object or item to leave the stack
        Stack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack: " + stack);

        Iterator<Integer> iterator = stack.createIterator();
        System.out.println("Iterating over the stack:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
