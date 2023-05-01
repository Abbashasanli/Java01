package homeworks.lesson20;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
     //  call(circle);
     //  call(square);
     //  call(rectangle);
     //  call(triangle);
     //  rectangle.paste();
     //  tell(rectangle);
       Rectangle rectangle1=new Rectangle();
        rectangle1.secret();
        Shape rectangle2=new Rectangle();
        rectangle2.print();
        System.out.println(rectangle2 instanceof Shape);
        System.out.println(rectangle2 instanceof Rectangle);




    }

  /*  private static void call(Rectangle rectangle) {
        rectangle.print();
    }

    private static void call(Circle circle) {
        circle.print();
    }

    private static void call(Square square) {
        square.print();
    }

    private static void call(Triangle triangle) {
        triangle.print();
    }*/
    private static void call(Shape shape){shape.print();}
    private static void tell(Rectangle rectangle){rectangle.paste();}

}



