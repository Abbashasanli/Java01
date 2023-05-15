package homeworks.lesson31;

public class LinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(125);
        linkedList.addHead(23);
        linkedList.addTail(45);
        System.out.println(linkedList);
        linkedList.addTail(7);
        System.out.println(linkedList);
        System.out.println(linkedList);
        linkedList.addHead(8);
        System.out.println(linkedList);
        linkedList.clear();
    }
}
