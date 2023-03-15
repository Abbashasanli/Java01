package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a >= 5) {
            System.out.println(a + 7);
        } else {
            System.out.println(a * a - 3 * a + 4);
        }
    }
}
