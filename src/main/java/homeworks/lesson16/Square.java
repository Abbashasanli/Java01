package homeworks.lesson16;

public class Square {
    public double side;
    public Square(double side){
        this.side=side;
    }
    public double perimeter(){
        return this.side*4;
    }
    public double area(){
        return side*side;
    }

    public static void main(String[] args) {
        Square kvadrat=new Square(4);
        System.out.println(kvadrat.area());
        System.out.println(kvadrat.perimeter());
    }


}
