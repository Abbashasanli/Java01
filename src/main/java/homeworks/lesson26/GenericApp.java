package homeworks.lesson26;

import javax.swing.*;
import java.util.Optional;

public class GenericApp {
    public static void main(String[] args) {
        String name = " ";
        String name2="abasv";
        System.out.println(check(name));
        System.out.println(check(name2));

    }

    public static Optional<String> check(String name) {
        if (name ==null||name.isEmpty()) {
            return Optional.empty();
        }else{
            return Optional.of(name);
        }
    }
}

