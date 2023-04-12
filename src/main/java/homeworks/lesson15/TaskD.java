package homeworks.lesson15;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();

        }
        int max = array[0];
        int indexOfMax=0;
        for (int i = 1; i < length; i++) {
            if (array[i] > max)
                max = array[i];
            indexOfMax=i;

        }
        System.out.println(max);
        System.out.println(indexOfMax);
    }
}

