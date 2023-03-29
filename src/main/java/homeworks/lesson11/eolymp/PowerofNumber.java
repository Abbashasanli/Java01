package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println((int)Math.pow(a,b));
    }
}
