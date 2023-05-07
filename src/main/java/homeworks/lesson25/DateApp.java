package homeworks.lesson25;

import java.time.DateTimeException;
import java.util.Scanner;

import static java.time.LocalDateTime.of;

public class DateApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int year = sc.nextInt();
                int month = sc.nextInt();
                int day = sc.nextInt();
                int hour = sc.nextInt();
                int minute = sc.nextInt();

                System.out.println(of(year, month, day, hour, minute));
                break;
            } catch (NumberFormatException | DateTimeException e) {
                System.out.println("invalid value ");
            }

        }
    }
}

