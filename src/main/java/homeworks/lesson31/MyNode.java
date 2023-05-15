package homeworks.lesson31;

public final class MyNode <E>{
    public E data;
    public MyNode<E> next;

    public MyNode(E data) {
        this.data = data;
        this.next=null;
    }

    public MyNode(E data, MyNode<E> next) {
        this.data = data;
        this.next = next;
    }
}
