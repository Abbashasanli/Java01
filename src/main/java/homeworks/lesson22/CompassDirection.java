package homeworks.lesson22;

public enum CompassDirection {
    North(0),South(180),West(90),East(360);

    public int Degree;

    CompassDirection(int Degree) {
        this.Degree= Degree;
    }
}
