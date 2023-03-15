package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class ConditionalStatement3 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a < -4) {
            System.out.println(a + 5);
        } else if (a <= 7) {
            System.out.println(a * a - 3 * a);
        } else {
            System.out.println(a * a * a + 2 * a);

        }
    }
}
