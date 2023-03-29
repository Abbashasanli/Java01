package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            System.out.printf("%.4f", x * x * x + 2 * x * x - 3);
            System.out.println();

        }


    }
}
