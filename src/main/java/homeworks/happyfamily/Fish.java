package homeworks.happyfamily;

public class Fish extends Pet {

    public Fish(String species, String nickname) {
        super(species, nickname);
    }

    public Fish(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {

    }
}
