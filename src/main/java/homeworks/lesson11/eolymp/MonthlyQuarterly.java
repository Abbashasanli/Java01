package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class MonthlyQuarterly {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        if (a == 12 || a == 10 || a == 11) {
            System.out.println("Fourth");
        }  if (a == 4 || a == 5 || a == 6) {
            System.out.println("Second");
        }  if (a == 3 || a == 2 || a == 1) {
            System.out.println("First");
        }
        if (a == 7 || a == 8 || a == 9) {
            System.out.println("Third");
        }

    }
}
