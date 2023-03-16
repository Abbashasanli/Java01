package homeworks.lesson9.eolymp.conditionsloops;

import java.util.Scanner;

public class CityNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        int num1 =scan.nextInt();
        if ((num+num1)%2==1) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
