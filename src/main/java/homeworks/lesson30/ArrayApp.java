package homeworks.lesson30;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 20);
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Arrays.toString(numbers);
        System.out.println(CheckerIndex(numbers,num));

    }

    public static Optional<Integer> CheckerIndex(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num) {
            }
            return Optional.of(i);
        }
        return Optional.empty();
    }
}
