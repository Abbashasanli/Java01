package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        int a=new Scanner(System.in).nextInt();
        int son =a%10;
        int ilk=a/10;
        int k=son+ilk;
        System.out.println((int) Math.pow(k,2));
    }
}
