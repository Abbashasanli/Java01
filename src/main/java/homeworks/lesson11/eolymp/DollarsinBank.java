package homeworks.lesson11.eolymp;


import java.util.Scanner;

public class DollarsinBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long S = scan.nextLong();
        long age = 1;
        long mon = 1;
        long sum = 1;
        while (sum < S) {
            age++;
            mon = mon * 2 + age;
            sum += mon;
        }
        System.out.print(age);
    }
}


