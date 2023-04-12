package homeworks.lesson17.Encapsulation;

public class RectangleApp {
    public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(3, 4);
     System.out.println(rectangle.getArea());
     System.out.println(rectangle.getPerimeter());
     System.out.println(rectangle.getA());
     System.out.println(rectangle.getB());
     System.out.println(rectangle.getA());
     System.out.println(rectangle.getB());

        Rectangle rectangle1 = new Rectangle(1, 2);
        System.out.println(rectangle1.getA());
        System.out.println(rectangle1.getB());
        rectangle1.setA(3);
        rectangle1.setB(0);
        System.out.println(rectangle1.getA());
        System.out.println(rectangle1.getB());
    }
}
