package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SimpleFunction {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double x= scan.nextDouble();
        System.out.printf("%.4f",x+Math.sin(x));
    }
}
