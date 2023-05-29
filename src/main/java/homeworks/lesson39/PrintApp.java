package homeworks.lesson39;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class PrintApp {
    public static final String RESOURCE = "src/main/java/homeworks/lesson39/files/";

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(RESOURCE + "student.txt"));
            bw.write(String.valueOf(new Student(23, "Alex", 34.0)));
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}