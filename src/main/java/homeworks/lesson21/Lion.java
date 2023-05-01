package homeworks.lesson21;

public class Lion extends Animal implements Runnable{
    @Override
    public void breath() {
        System.out.println("Lion is breathing");
    }

    @Override
    public void run() {
        System.out.println("Lion is running");
    }
}
