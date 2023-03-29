package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SumAndAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        int sum = 0;

        while (scan.hasNext()) {
            int a = scan.nextInt();
            sum = sum + a;
            count++;
        }
        System.out.println(count + " " + sum);

    }
}
