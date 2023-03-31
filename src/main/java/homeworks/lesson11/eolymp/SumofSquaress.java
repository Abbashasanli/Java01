package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SumofSquaress {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
