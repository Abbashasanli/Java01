package homeworks.lesson17.Inheritance;

public class Rectangle {
    private double a;
    private double b;
    private double Area;
    private double Perimeter;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.Area=a*b;
        this.Perimeter=2*(a+b);
    }

    public double getArea() {
        return Area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void draw(){
        System.out.println("done!");
    }
}
