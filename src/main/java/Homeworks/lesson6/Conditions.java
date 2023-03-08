package Homeworks.lesson6;

import java.util.Scanner;

public class Conditions {
    public static void mainv1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


    }

    public static void mainv2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

    }

    public static void mainv3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("postive");
        } else {
            System.out.println("negative");

        }
    }}

