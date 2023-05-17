package homeworks.lesson33;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueApp {
    public static void main(String[] args) {

        Deque<String> city = new LinkedList<>();
        city.add("Baku");
        city.add("Sumqayit");
        city.add("Ganja");
        city.add("Quba");
        city.add("Samaxhi");
        city.push("Ankara");
        System.out.println(city);
        System.out.println(city.getLast());
        System.out.println(city.pollFirst());
        System.out.println(city.pollLast());
        System.out.println(city.removeLast());
        System.out.println(city.pop());
        System.out.println(city.size());
        System.out.println(city);


    }
}
