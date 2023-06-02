package homeworks.lesson42;

public class ThreadApps {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        }).start();
    }
}
