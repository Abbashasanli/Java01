package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class NotGreaterthanTwoPointFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();
        }
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 2.5) {
                index = i;
                System.out.printf("%d %.2f", index+1 ,array[i]);
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not Found");
        }
    }
}