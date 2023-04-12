package homeworks.lesson17.Inheritance2;

public class Rectangle extends Figure {
  private double a;
  private double b;

  public Rectangle(double a, double b) {
    super(a*b,2*(a+b));
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }
}
