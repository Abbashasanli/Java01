package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class ValueofVariable2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a= scan.nextInt();
        System.out.printf("%.3f", a-(a*a+4)/2+(a*a*a)-3/(a+7));
    }
}
