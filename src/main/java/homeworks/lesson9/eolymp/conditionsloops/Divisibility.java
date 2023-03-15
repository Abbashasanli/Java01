package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int a = scan.nextInt();
        int b =scan.nextInt() ;
        int reminder = a % b;
        int quot = a / b;
        if (a % b == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println(quot + " " + reminder);
        }
    }
}
