package homeworks.lesson7;

import java.util.Scanner;

public class SumofDigitsApp {
    public static void mainv1(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int last =num%10;
        int third=(num/10)%100;
        int second=num%100;
        int first=num%1000;
        int sumofdigits= first+second+third+last;
        System.out.println(sumofdigits);


    }

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum =0;
        for (; num>0; ) {
            int reminder=num%10;
            num=num/10;
            sum=sum+reminder;
            System.out.println("Sum is"+sum);

        }


    }
}


