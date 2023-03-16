package homeworks.lesson10;

import java.util.Scanner;

public class ArrayApp {
    public static void mainv1(String[] args) {
        double[] grades = new double[7];
        grades[0] = 40.0;
        grades[1] = 20.0;
        grades[2] = 60.0;
        grades[3] = 70.0;
        grades[4] = 80.0;
        grades[5] = 90.0;
        grades[6] = 100.0;

        System.out.println(grades[1]);
        System.out.println(grades[4]);
    }


    public static void mainv2(String[] args) {
        double[] grades = new double[]{1, 2, 3,};
        double[] grades1 = {12, 23, 33};
        for (int i = 0; i < grades1.length; i++) {
            System.out.print(grades[i] + "");


        }
    }


    public static void mainv4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("enter value");
            int num = scan.nextInt();
            nums[i] = num;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            int num = in.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }


        }
    }
}
