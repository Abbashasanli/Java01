package homeworks.lesson31;

import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Object> nums = new ArrayList<>();
        System.out.println(names);
        System.out.println(names.size());
        names.add("Abbas");
        names.add("Abbas");
        names.add("Abbas");
        names.add("Abbas");
        names.add("Abbas");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        nums.add("hgf");
        nums.add("gvmbmmj");
        System.out.println(nums);
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            num.add((int) (Math.random() * 100));
        }
        System.out.println(num);
        names.clear();

    }
}


