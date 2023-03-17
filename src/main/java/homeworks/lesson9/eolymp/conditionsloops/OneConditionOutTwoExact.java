package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class OneConditionOutTwoExact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        if (a % 2 ==0 && (a>=0 || a%3!=0)  || (a%3==0 && a<0 && a%2!=0 ) ) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
