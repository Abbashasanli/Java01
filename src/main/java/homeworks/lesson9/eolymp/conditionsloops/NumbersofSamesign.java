package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class NumbersofSamesign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b < 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
