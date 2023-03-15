package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class TwoDigitnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println("No");
        } else if (a > 9 && a < 100) {
            System.out.println("Ok");
        } else if (a < -9 && a > -100) {
            System.out.println("Ok");
        } else {
            System.out.println("No");

        }

    }
}

