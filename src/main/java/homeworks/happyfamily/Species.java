package homeworks.happyfamily;

public enum Species {
    Dog ("Golden"), Cat("Anatolian ") , Bird("Parrot"), Fish("Clown");
    public String type;

    Species(String type) {
        this.type = type;
    }
}