package homeworks.lesson15;

import java.util.Scanner;

public class MaxSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double max = 0;
        for (int i = 0; i < num; i++) {
            double b = scan.nextDouble();
            if (Math.abs(b) > max) {
                max = Math.abs(b);
            }


        }
        System.out.printf("%.2f", max);
    }
}

