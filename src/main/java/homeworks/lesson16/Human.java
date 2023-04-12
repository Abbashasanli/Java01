package homeworks.lesson16;

public class Human {
    public int age;
    public double height;
    public String name;

    public Human(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void sleep() {
        System.out.println("Human is leeeping...");
    }

    public void wakeup() {
        System.out.println("Abbas waked up");
    }

}

