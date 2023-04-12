package homeworks.lesson16;

public class HumanApp {
    public static void main(String[] args) {
        Human Abbas=new Human(20,173,"Abbas");
        System.out.println(Abbas);
        Abbas.sleep();
        Abbas.wakeup();
        Abbas=null;
        System.out.println(Abbas);
    }
}
