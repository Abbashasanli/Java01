package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class PostiveNegativeZero {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a == 0) {
            System.out.println("Zero");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");

        }
    }
}
