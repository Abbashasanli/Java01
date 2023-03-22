package homeworks.lesson11;

import java.util.Scanner;

public class ArrayOperationsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of array");
        int length = scan.nextInt();
        int [] numbers= new  int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("please enter "+(i+1)+".element of array");
            numbers[i]= scan.nextInt();
        }
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
        for (int num:numbers){
            System.out.print(num+" ");
        }
        System.out.println();
        int sum =0;
        long prod=1;
        for (int i = 0; i <length ; i++) {
            int currentElement=numbers[i];
            sum +=currentElement;
            prod*=currentElement;
        }
        System.out.println("sum is " +sum );
        System.out.println("prod is " +prod );

        int min=numbers[0];
        int max =numbers[0];
        for (int i = 0; i <length ; i++) {
           int curr=numbers[i];
           if (min>curr){
               min=curr;
           }if (max<curr){
               max=curr;
            }
            System.out.println("min is:"+ min);
            System.out.println("max is:"+ max);

        }

        }



    }
