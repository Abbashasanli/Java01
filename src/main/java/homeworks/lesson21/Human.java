package homeworks.lesson21;

public class Human extends Alive implements Runnable,Swim,Speak{
    @Override
    public void breath() {
        System.out.println("Human is breathing ....");
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void swim() {
        System.out.println("Human is swimming...");
    }

    @Override
    public void speak() {
        System.out.println("human is speaking");
    }


}
