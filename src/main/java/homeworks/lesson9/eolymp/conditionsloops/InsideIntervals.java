package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class InsideIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a >= b && a <= c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
