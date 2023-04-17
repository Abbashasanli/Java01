package homeworks.lesson22;

public enum CompassDirection {
    North(0),South(180),West(90),East(360);

    public int degreeofdirections;

    CompassDirection(int degreeofdirections) {
        this.degreeofdirections = degreeofdirections;
    }
}
