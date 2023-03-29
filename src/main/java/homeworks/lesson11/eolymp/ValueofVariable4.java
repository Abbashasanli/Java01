package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class ValueofVariable4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double x = scan.nextDouble();
        double y=  ((2*x-1)/(x*x))+(Math.sqrt(x*x+1))/2;
        System.out.printf("%.3f",y);

    }
}
