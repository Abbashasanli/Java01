package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SumofSquaress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i * i;
        }
        System.out.print(sum);
    }
}
