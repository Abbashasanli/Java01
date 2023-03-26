package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class RectangularorNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a * a) + (b * b) == c * c || (b * b) + (c * c) == a * a || (a * a) + (c * c) == b * b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
