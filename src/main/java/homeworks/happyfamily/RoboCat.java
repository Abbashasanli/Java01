package homeworks.happyfamily;

public class RoboCat extends Pet{
    public RoboCat(String species, String nickname) {
        super(species, nickname);
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {

    }
}
