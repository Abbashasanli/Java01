package homeworks.lesson20;

public class Rectangle extends Shape{
    @Override
    public void print() {System.out.println(Rectangle.class.getName());}
    public void paste(){
        System.out.println("paste rectangle");

    }
    public void secret(){
        System.out.println(Rectangle.class.getName()+"secret");
    }
}
