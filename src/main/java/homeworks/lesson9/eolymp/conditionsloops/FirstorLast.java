package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class FirstorLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int last = a % 10;
        int first = a / 100;
        if (last == first) {
            System.out.println("=");
        } else if (last > first) {
            System.out.println(last);
        } else System.out.println(first);
    }
}
