import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements Stack<E> {
    private StackNode<E> top;

    public LinkedStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        StackNode<E> current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void push(E item) {
        StackNode<E> newNode = new StackNode<>(item);
        newNode.next = top;
        top = newNode;
    }

    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E data = top.data;
        top = top.next;
        return data;
    }

    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        StackNode<E> current = top;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public Iterator<E> createIterator() {
        return new LinkedStackIterator();
    }
    private class LinkedStackIterator implements Iterator<E> {
        private StackNode<E> current;

        public LinkedStackIterator() {
            this.current = top;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}
