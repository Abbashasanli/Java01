package homeworks.lesson8;

import java.util.Scanner;

public class Whlieapp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int prod = 1;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count++;
            sum += rem;
            prod *= rem;
        }

        System.out.printf("Sum of digit is:%d\n", sum);
        System.out.printf("Prod of digits is :%d\n", prod);
        System.out.printf("Count of digits is:%d\n", count);


    }
}
