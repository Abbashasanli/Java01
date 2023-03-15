package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if ((a == 0) || (a > 12)) {
            System.out.println("invalid month");
        } else if (a >= 3 && a <= 5) {
            System.out.println("Spring");

        } else if (a >= 6 && a <= 8) {
            System.out.println("Summer");
        } else if (a >= 9 && a <= 11) {
            System.out.println("Autumn ");
        } else System.out.println("Winter");

    }

}


