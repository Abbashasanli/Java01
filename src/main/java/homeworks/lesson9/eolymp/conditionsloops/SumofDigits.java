package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int last = num % 10;
        int first = (num / 1000) % 10;
        System.out.println(last + first);
    }
}
