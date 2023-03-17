package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class OneCondtionoOutTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if ((a % 2!=0) || (a >= 100 && a <= 999)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
