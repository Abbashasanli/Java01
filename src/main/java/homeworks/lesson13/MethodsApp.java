package homeworks.lesson13;

import java.util.Arrays;

public class MethodsApp {
    public static void main1(String[] args) {
        printHelloWorld();
        double random =randomTimes5();
        System.out.println(random);
        printUppercase("Ahghsa");
        System.out.println(Math.abs(-9));

    }
    public static void printHelloWorld(){
        System.out.println("HelloWorld");

    }
    public static double randomTimes5(){
        return (Math.random()*5);
    }
    public static void printUppercase(String a){
        System.out.println(a.toUpperCase());
    }
    public static int [] fillWith(int size){
        int[] nums=new int[size];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]=((int) Math.random()*11);

        }
        return nums;
    }
    public static void printArray(int[]Array){
        System.out.println(Arrays.toString(Array));
    }

    public static void main(String[] args) {
        int[] ints=fillWith(5);
        printArray(ints);
    }
}
