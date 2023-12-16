import java.util.EmptyStackException;

public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E item);
    E pop() throws EmptyStackException;
    E peek() throws EmptyStackException;
    Iterator<E> createIterator();
}
