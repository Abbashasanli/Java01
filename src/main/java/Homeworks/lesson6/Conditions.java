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
    }

    public static void mainv4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 1) {
            System.out.println("january");
        } else if (num == 2) {
            System.out.println("febuary");
        } else if (num == 3) {
            System.out.println("march");
        } else if (num == 4) {
            System.out.println("april");
        } else if (num == 5) {
            System.out.println("may");
        } else if (num == 6) {
            System.out.println("june");
        } else if (num == 7) {
            System.out.println("july");
        } else if (num == 8) {
            System.out.println("august");
        } else if (num == 9) {
            System.out.println("september");
        } else if (num == 10) {
            System.out.println("october");
        } else if (num == 11) {
            System.out.println("novomber");
        } else if (num == 12) {
            System.out.println("december");
        } else {
            System.out.println("month isnt valid");

        }

    }

    public static void mainv5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 0 || num > 12) {
            System.out.println("month isnt valid");
        } else if (num >= 3 && num <= 5) {
            System.out.println("spring");
        } else if (num >= 6 && num <= 8) {
            System.out.println("summer");
        } else if (num >= 9 && num <= 11) {
            System.out.println("autumn");
        } else {
            System.out.println("winter");
            {

            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("Jule");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;


        }
    }
}





















