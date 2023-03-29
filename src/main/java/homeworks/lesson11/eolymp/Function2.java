package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            System.out.printf("%.4f", Math.sqrt(x) + 2 * x + Math.sin(x));
            System.out.println();
        }


    }
}
