package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class SimpleProblemApps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int first = num / 10;
        int second = num % 10;


        System.out.println(first + " " + second);

    }
}
