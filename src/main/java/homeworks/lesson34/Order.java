package homeworks.lesson34;

import java.time.LocalDateTime;


public final class Order<T> {
    private final T orderId;
    private String name;
    private double price;
    private LocalDateTime orderTime;

    public Order(T orderId, String name, double price, LocalDateTime orderTime) {
        this.orderId = orderId;
        this.name = name;
        this.price = price;
        this.orderTime = orderTime;
    }

    public T getId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    @Override
    public String toString() {
        return String.format("Order{id=%s, name='%s', price=%s, orderTime=%s}", orderId, name, price, orderTime);
    }
}

