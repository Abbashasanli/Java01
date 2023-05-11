package homeworks.lesson31;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistApp {
    public static void main(String[] args) {
        ArrayList<Double>nums = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            nums.add(Math.random()*100);
        }
        System.out.println(nums);
        nums.add(34.0);
        nums.toString();
        nums.clear();
        nums.toArray();
        nums.trimToSize();
        nums.indexOf(4);
        nums.removeAll(nums);
        System.out.println(nums.size());


    }
}
