package homeworks.lesson41;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("My Thread  " + super.getName() + "  is working");
    }


}
