package homeworks.lesson21;

public class Fish extends Animal implements Swim{
    @Override
    public void breath() {
        System.out.println("blooo");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
