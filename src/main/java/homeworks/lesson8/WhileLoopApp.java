package homeworks.lesson8;

import java.util.Scanner;

public class WhileLoopApp {
    public static void mainv1(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
        while (num > 0) {
            int reminder = num % 10;
            num = num / 10;
            sum = sum + reminder;
            System.out.println(sum);

        }

    }
}



