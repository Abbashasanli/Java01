package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            int num = scan.nextInt();
            numbers[i] = num;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
