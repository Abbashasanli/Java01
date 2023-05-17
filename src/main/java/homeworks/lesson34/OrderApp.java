package homeworks.lesson34;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

public class OrderApp {
    private static Queue<Order<String>> queue = new LinkedList<>();

    public static void main(String[] args) {
        makeOrder("big mac",30,LocalDateTime.now());
        System.out.println(queue);

    }
    public static void makeOrder(String name, double price, LocalDateTime orderTime) {
        final String id = UUID.randomUUID().toString();
        Order<String> order = new Order<>(id, name, price, orderTime);
        queue.add(order);
    }

}