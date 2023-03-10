package homeworks.lesson7;

import java.util.Scanner;

public class ForLoopApp {
    public static void mainv1(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i *= 2) {
            System.out.println(i);

        }

    }

    public static void mainv2(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = num; i >= 0; i -= 1) {
            System.out.println(i);

        }


    }

    public static void mainv3(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i < num; i++) {
            if (num % 2 == 1) {
                System.out.println(i);
            } else {
                System.out.println("not valid value");
                break;
            }


        }

    }

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i > 0 ; i++ ) {

            System.out.println("AA");
        }
        }
    }












