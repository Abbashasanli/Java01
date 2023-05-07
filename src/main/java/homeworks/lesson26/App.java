package homeworks.lesson26;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Integer num = 4;
        String line = "sgf";
        LocalDate date = LocalDate.now();
        method(line);
        method(num);
        method(date);
        String name = getorThrow("ads");
        Integer o = getorThrow(null);

    }

    public static void method(String line) {
        if (line == null) {
            throw new NullPointerException("Invalid Output");
        }
    }

    public static void method(Integer num) {
        if (num == null) {
            throw new NullPointerException("Invalid Output");

        }
    }

    public static void method(LocalDate date) {
        if (date == null) {
            throw new NullPointerException("invalid data");
        }
    }

    public static <T> T getorThrow(T data) {
        if (data == null) {
            throw new NullPointerException("Invalid input");

        }return data;

    }
}