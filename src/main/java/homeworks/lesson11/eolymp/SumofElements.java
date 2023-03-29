package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class SumofElements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int enter= scan.nextInt();
        double sum=0;
        for (int i = 0; i < enter; i++) {
            double b= scan.nextDouble();
            sum+=b;


        }
        System.out.println(sum);
    }
}
