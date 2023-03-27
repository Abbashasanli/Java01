package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SquareRoot2 {
    public static void main(String[] args) {
        Scanner scan  =new Scanner(System.in);
        int a= scan.nextInt();
        int first=a/100;
        int second=(a/10)%10;
        int last=a%10;
        int sum=first+second+last;
        System.out.printf("%.3f", Math.sqrt(sum));
    }
}
