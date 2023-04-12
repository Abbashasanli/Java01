package homeworks.lesson17.Inheritance2;

public class Square extends Figure {
    private double a;

    public Square(double a) {
        super(a*a,a*4);
        this.a = a;
    }

    public double getA() {
        return a;
    }
}
