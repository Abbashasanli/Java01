package homeworks.happyfamily;

public class Dog extends Pet{
    @Override
    public void eat() {

    }

    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
}
