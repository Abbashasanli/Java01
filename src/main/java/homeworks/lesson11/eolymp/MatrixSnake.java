package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class MatrixSnake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int counter = 1;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row % 2 == 0) {
                    System.out.print(counter++ + "\t");

                } else System.out.print(--counter + "\t");
            }
            counter+=n;
            System.out.println();
        }
    }
}

