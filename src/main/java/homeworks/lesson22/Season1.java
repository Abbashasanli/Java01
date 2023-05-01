package homeworks.lesson22;

public enum Season1 {
    Spring(23),Summer(40),Winter(-6),Autumn(12);
    private final double Temp;

    public double getTemp() {
        return Temp;
    }

    Season1(double temp) {
        Temp = temp;

    }
}
