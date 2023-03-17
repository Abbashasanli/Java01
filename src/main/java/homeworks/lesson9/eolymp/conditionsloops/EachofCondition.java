package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class EachofCondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if ((a % 6 == 0 && a >= 10 && a <= 99)|| (a%6==0 && a<=-10 && a>=-99)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}


