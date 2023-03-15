package homeworks.eolymp.conditionsloops;

import java.util.Scanner;

public class MInMaxApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int num1 = new Scanner(System.in).nextInt();
        if (num > num1) {
            System.out.println(num1 + " " + num);
        } else {
            System.out.println(num + " " + num1);


        }

    }
}

