package homeworks.lesson33;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MapApp {
    public static void main(String[] args) {
        HashMap<Integer, Queue<String>> table = new HashMap<>();
        Queue<String> class1 = new LinkedList<>();
        Queue<String> class2 =new LinkedList<>();
        Queue<String> class3 =new LinkedList<>();
        class1.add("Asif");
        class1.add("Vasif");
        class2.add("Nigar");
        class3.add("Rehman");
        class2.add("Narmin");
        table.put(1,class1);
        table.put(2,class2);
        table.put(3,class3);
        System.out.println(table);
        System.out.println(table.get(1));
        System.out.println(table.values());
        System.out.println(table.put(3,class2));
        table.get(3);










    }
}
