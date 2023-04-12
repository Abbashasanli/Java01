package homeworks.lesson18;



public class Square extends Figure1 {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("square...");

    }

    @Override
    public void write() {
        System.out.println("write square");
    }
}