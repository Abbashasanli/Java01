package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class NumberinReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        do {
                System.out.print(num % 10);
                num /= 10;

            } while (num > 0);
        }
    }
