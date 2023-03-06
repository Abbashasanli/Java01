package Homeworks.lesson5;

public class TernoryOperator {
    public static void main(String[] args) {
        int a=41;
        String result =a % 2==0 ? "even" : "odd";
        String result4=(a-3) % 2==0 ? "O" : "E";
        System.out.println(result);
        System.out.println(result4);

    }
}
