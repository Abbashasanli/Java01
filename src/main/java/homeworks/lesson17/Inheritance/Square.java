package homeworks.lesson17.Inheritance;

public class Square {
    private double a;
    public Square(double a){
        this.a=a;
    }
    public double getArea(){
        return a*a;

    }
    public double getPerimeter(){
        return 4*a;
    }
    public void draw(){
        System.out.println("done!");
    }
}
