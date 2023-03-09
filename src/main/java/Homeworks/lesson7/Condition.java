package Homeworks.lesson7;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (num % 3 == 0) {
            System.out.println("fizz");
        } else if (num % 5 == 0) {
            System.out.println("buzz");


        }
    }}




