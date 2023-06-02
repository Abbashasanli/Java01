package homeworks.lesson42;

import homeworks.lesson41.MyThread;

public class ThreadApp {
    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(() -> System.out.println(Thread.currentThread().getId())).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
            }
        }).start();
        System.out.println(new Thread(new MyThread()).getId());

        new Thread(new MyThread()).start();

    }

    public static class MyThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i <4 ; i++) {
                System.out.println(Thread.currentThread().getName());
            }

        }
    }
}
