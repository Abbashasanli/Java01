package Homeworks.lesson6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DynamicInputapp {
    public static void mainv1(String[] args) {
        int num = 17;
        boolean iseven = num % 2 == 0;
        System.out.println(iseven ? "cut" : "tek");
    }

    public static void mainv2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean iseven = num % 2 == 0;
        System.out.println(iseven ? "cut" : "tek");
    }

    public static void mainv3(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        System.out.printf("%.5f", num);


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.charAt(0));
        System.out.println(word.length() - 2);
        System.out.println(word.repeat(6));
        System.out.println(word.trim());

    }
}






