package homeworks.lesson15;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int length = scan.nextInt();
        int []array =new int[length];
        for (int i = 0; i < length; i++) {
            array[i]= scan.nextInt();

        }
        int count =0;
        for (int i = 1; i < length-1; i++) {
            int curr=array[i];
            int prev=array[i-1];
            int next=array[i+1];
            if (curr>prev && curr>next){
                count++;
            }

        }
        System.out.println(count);

    }
}
