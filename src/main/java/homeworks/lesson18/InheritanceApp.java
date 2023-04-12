package homeworks.lesson18;
public class InheritanceApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.draw();
        Square square = new Square(3);
        square.draw();
        Triangle triangle = new Triangle();
        triangle.draw();
        System.out.println(triangle.getHello());
        System.out.println(rectangle.getHello());
        triangle.write();
        rectangle.write();
        square.write();


    }
}
