package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberoflines = scan.nextInt();
        for (int i = 0; i < numberoflines; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a + b);
        }
    }
}


