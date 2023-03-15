package homeworks.eolymp.conditionsloops;

import java.util.Scanner;

public class LevelEducation {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        if (num == 0 && num > 12) {
            System.out.println("not valid");
        } else if (num <= 3) {
            System.out.println("Initial");
        } else if (num >= 4 && num <= 6) {
            System.out.println("Average");
        } else if (num >= 7 && num <= 9) {
            System.out.println("Sufficient ");
        } else if (num >= 10 && num <= 12) {
            System.out.println("High ");

        }

    }

}





