package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class ValueofVariable1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float a=scan.nextInt();
        System.out.printf("%.3f",a*a*a-(5*a*a)/7+9*a-3/a+1);
    }
}
