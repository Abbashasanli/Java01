package homeworks.lesson18;


public class Rectangle extends Figure1 {
    private double length;
    private double wide;

    public Rectangle(double length, double wide){
        this.length=length;
        this.wide=wide;

    }

    public double getLength() {
        return length;
    }

    public double getWide() {
        return wide;
    }

    @Override
    public void draw() {
        System.out.println("rectangle...");
    }

    @Override
    public void write() {
        System.out.println("write rectangle");
    }
}
