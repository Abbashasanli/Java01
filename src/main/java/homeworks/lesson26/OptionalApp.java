package homeworks.lesson26;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {


    }

    public static Optional<Integer> validateAge(int age) {
        if (age < 0 || age > 150) {
           return Optional.of(null);
        }
        return  Optional.of(age);
    }
}
