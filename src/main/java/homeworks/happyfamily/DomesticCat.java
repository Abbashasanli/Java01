package homeworks.happyfamily;

public class DomesticCat extends Pet{
    public DomesticCat(String species, String nickname) {
        super(species, nickname);
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {

    }
}
