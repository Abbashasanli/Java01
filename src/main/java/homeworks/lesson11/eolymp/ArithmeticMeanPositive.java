package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class ArithmeticMeanPositive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double sum = 0;
        double n = 0;
        for (int i = 0; i < a; i++) {
            double b = scan.nextDouble();
            if (b > 0) {
                sum += b;
                n++;

            }
        }
        if (n == 0) {
            System.out.println("Not Found");
        } else {
            System.out.printf("%.2f", sum / n);

        }
    }
}