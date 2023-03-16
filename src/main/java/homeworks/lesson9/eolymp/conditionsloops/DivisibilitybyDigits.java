package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class DivisibilitybyDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int d = k % 10;
        int c = (k / 10) % 10;
        int b = (k/ 100) % 10;
        int a = (k / 1000);

        if ((a!=0 && b!=0 && c!=0 && d!=0)&&(k%a==0&&k%b==0&&k%c==0&&k%d==0)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}


