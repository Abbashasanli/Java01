package homeworks.lesson29;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class LinearSearchApp {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);

        }

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(Arrays.toString(numbers));
        System.out.println(Checker(numbers,num));
    }
    public static Optional<Integer> Checker(int[]arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
            }return Optional.of(i);
        }
        return Optional.empty();
    }
}
