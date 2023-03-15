package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class OneDigitnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a < 10 && a >-10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
