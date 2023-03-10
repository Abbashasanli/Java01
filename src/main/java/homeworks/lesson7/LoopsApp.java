package homeworks.lesson7;

import java.util.Scanner;

public class LoopsApp {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(a);

        }

    }
}
