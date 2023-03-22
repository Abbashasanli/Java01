package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int column = scan.nextInt();
        int row = scan.nextInt();
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j < row; j++) {
                System.out.print("#");
            }
            System.out.println("#");


        }
    }
}

