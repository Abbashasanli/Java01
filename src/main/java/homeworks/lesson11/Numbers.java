package homeworks.lesson11;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 101);
        System.out.print("Please enter your name :");
        String name = scan.next();
        System.out.println("Let the game begin!");


        while (true){
            System.out.print("Please enter number :");
            int guess= scan.nextInt();
            if (num>guess) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (num<guess) {
                System.out.println("Your number is too big. Please, try again.");
            }else {
                System.out.printf("Congratulations,"+ name+ "!");
                break;

            }

        }

    }
}

