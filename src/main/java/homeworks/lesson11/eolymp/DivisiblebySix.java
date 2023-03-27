package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class DivisiblebySix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < num; i++) {
            {
                int a = scan.nextInt();
                if (a % 6 == 0 && a > 0) {
                    sum += a;
                    count++;
                }

            }

        }
        System.out.println(count + " " + sum);
    }
}
