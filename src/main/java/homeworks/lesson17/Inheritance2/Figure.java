package homeworks.lesson17.Inheritance2;

public class Figure {
    private double area;
    private double perimeter;
    public Figure(double area,double perimeter){
        this.area=area;
        this.perimeter=perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public void draws(){
        System.out.println("Figure..!");
    }
}
