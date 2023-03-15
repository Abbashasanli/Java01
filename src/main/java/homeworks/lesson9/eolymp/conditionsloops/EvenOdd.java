package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
