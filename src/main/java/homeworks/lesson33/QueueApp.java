package homeworks.lesson33;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();
        names.add("Rabil");
        names.add("gvnb ");
        names.add("Rasim");
        names.add("Asif");
        System.out.println(names);
        names.remove("Rasim");
        System.out.println(names.peek());
        System.out.println(names.poll());
        System.out.println(names);
        System.out.println(names.add("Rabil"));
        System.out.println(names.isEmpty());
        System.out.println(names.remove("Asif"));
        System.out.println(names);

    }
}
