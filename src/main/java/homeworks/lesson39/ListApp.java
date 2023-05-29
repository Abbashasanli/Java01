package homeworks.lesson39;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListApp {
    public static void main(String[] args) throws RuntimeException {
        List<Integer> num = new Random().ints(10, 0, 100)
                .boxed()
                .collect(Collectors.toList());

        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(PrintApp.RESOURCE + "names.ser")));
            for (Integer element : num) {
                byte[] bytes = element.toString().getBytes();
                bos.write(bytes);
                bos.close();
                bos.write('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



