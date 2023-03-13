package homeworks.lesson8;

import java.util.Scanner;

public class DoWhileApp {
    public static void mainv1(String[] args) {
        int num = new Scanner(System.in).nextInt();
        while (num > 0) {
            if (num > 0) {
                System.out.println(num % 10);
                num /= 10;
            } else {
                break;
            }
        }
    }

    public static void mainv3(String[] args) {
        int num = new Scanner(System.in).nextInt();
        do {
            System.out.println(num);
            if (num > 0) {
                System.out.println(num % 10);
                num /= 10;

            }
        } while (num > 0);

    }


    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);

        }
    }
}


