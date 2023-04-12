package homeworks.lesson17.Inheritance2;

import homeworks.lesson17.Inheritance.Rectangle;

public class InheritanceApp {
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.draws();
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        rectangle.draw();

    }
}
