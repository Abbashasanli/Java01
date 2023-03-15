package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class Sgn {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        if (num == 0) {
            System.out.println(0);
        } else if (num < 0) {
            System.out.println(-1);
        } else {
            System.out.println(1);

        }
    }
}

