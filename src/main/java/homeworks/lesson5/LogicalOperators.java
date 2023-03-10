package homeworks.lesson5;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(c);
        int i = 40;
        boolean iseven = (i % 2) == 0;
        boolean isodd = (i % 2) == 1;
        System.out.println(iseven);
        System.out.println(isodd);
        boolean second = iseven && i >= 50;
        System.out.println(second);
        boolean sec = iseven && i > 29;
        System.out.println(sec);
        boolean seco = isodd || i > 39;
        System.out.println(seco);
        boolean secoc = isodd || i > 41;
        System.out.println(secoc);
    }
}
