package homeworks.lesson34;

public class Order {
    private int id;
    private double price;
    private String name;

    public Order(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

  public static int processOrder(int id){
      return id;
  }
  public static int orderFood(int id){
        return id;
  }

    @Override
    public String toString() {
        return String.format("Order{id=%d, price=%s, name='%s'}", id, price, name);
    }
}
