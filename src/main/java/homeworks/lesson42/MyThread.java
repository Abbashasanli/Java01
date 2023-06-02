package homeworks.lesson42;

public class MyThread extends Thread{
    @Override
    public synchronized void start() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }
}
