package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class NoneofTwoconditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if ((a % 2 == 0 && a > 0)  || (a%2!=0 && a<0)) {
            System.out.println("NO");

        } else System.out.println("YES");

    }
}