package homeworks.lesson8;

import java.util.Scanner;

public class DigitOperationApp {
    public static void main(String[] args) {
        //input
        int num = new Scanner(System.in).nextInt();
        // process
        int count = 0;
        int sum = 0;
        int prod = 1;
        while (num > 0) {
            int reminder = num % 10;
            num/=10;
            sum += reminder;
            prod *= reminder;
            count++;
        }
        //output
        System.out.printf("count of digits is: %d\n ", count);
        System.out.printf("sum of digits is: %d\n ", sum);
        System.out.printf("product of digits is: %d\n ", prod);

    }
}
