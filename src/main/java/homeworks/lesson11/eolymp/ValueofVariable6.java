package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class ValueofVariable6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
       double b=((Math.sqrt((a * a * a * a) + 1)) /( a * a)) - Math.sqrt((a * a )/ (a * a + 1));
        System.out.printf("%.3f",b);
    }
}
