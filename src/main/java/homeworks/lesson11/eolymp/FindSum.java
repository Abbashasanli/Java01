package homeworks.lesson11.eolymp;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        double s=0;
        for (int i = 1; i <=a ; i++) {
             s+=1.00/(i*(i+1));


        }
        System.out.printf("%.6f",s);
    }
}
