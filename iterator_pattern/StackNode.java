public class StackNode<E>{
    E data;
    StackNode<E> next;

    public StackNode(E data){
        this.data = data;
        this.next = null;
    }
}
