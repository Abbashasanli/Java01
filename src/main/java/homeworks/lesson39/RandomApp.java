package homeworks.lesson39;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        new Random().ints(10,0,100)
                .filter(num->num%2==0)
                .forEach(System.out::println);
        File txt=new File("fayl.txt");
        try {
            FileWriter fileWriter = new FileWriter(txt);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
