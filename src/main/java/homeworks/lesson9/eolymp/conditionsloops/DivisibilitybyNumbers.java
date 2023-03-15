package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class DivisibilitybyNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (n % a == 0 && n % b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
