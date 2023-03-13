package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class ProductofDigits {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int last = num % 10;
        int sec = (num / 10) % 10;
        int first = num / 100;
        System.out.println(last * sec * first);
    }
}
