package homeworks.eolymp.conditionsloops;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int first = (num / 100)%10;
        int last = num % 10;
        if (first > last) {
            System.out.println(first);
        } else if (last> first) System.out.println(last);
        else System.out.println("==");

    }

}



