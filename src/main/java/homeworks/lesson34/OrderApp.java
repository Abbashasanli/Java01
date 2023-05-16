package homeworks.lesson34;

import java.util.LinkedList;
import java.util.Queue;

public class OrderApp {
    public static void main(String[] args) {
        Queue<Integer> orders = new LinkedList<>();
        Order a = new Order(1233, 30, "soup");
        orders.add(a.getId());
        System.out.println(orders);
        Order.processOrder(34);
        System.out.println(orders);
        System.out.println(a);










    }

    }

