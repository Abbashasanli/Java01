package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n + 1;
            }
            counter += 1;

        }
        System.out.println(counter);


    }
}