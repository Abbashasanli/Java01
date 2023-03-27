package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double sum = 0;
        int n = 0;

        for (int i = 0; i < a; i++) {
            double b = scan.nextDouble();
            if (b < 0) {
                sum += b;
                n++;
            }

        }
        System.out.printf(n + " " + "%.2f", sum);
    }
}
