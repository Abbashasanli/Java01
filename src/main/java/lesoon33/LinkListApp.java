package lesoon33;

import java.util.LinkedList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Asif");
        names.add("Ceyhun");
        names.add("Ramil");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.getFirst());
        System.out.println(names.remove(2));
        System.out.println(names);
        System.out.println(names.add("Asif"));
        System.out.println(names);
        System.out.println(names.set(2, "Asif"));
    }
}
