package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class CondtionalStatement2 {
    public static void main(String[] args) {
        long a = new Scanner(System.in).nextLong();
        if (a >= 10) {
            System.out.println(a * a * a + 5 * a);
        } else {
            System.out.println(a * a - 2 * a + 4);
        }
    }
}
