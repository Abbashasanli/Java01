package homeworks.lesson15;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maxsalary=-1;
        while (scan.hasNext()){
            double salary= scan.nextDouble();
            if (maxsalary<salary) {maxsalary=salary;}
        }
        System.out.printf("%.2f",maxsalary);

    }
}

