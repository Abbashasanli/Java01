package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int b = (int) Math.sqrt(a);
        if (b * b == a) {
            System.out.println( b);
        } else System.out.println("No");
    }
}
