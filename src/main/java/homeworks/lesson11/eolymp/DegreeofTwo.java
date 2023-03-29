package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class DegreeofTwo {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        while (a % 2 == 0) {
            a = a / 2;
        }
            if (a == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

