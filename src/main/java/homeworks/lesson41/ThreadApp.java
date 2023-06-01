package homeworks.lesson41;


public class ThreadApp {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread());
        new MyThread("a").run();
        new MyThread("b").run();
        new MyThread("c").run();
        new MyThread("d").run();

    }
}
