package homeworks.lesson41;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class PersonApp {

    public static final String RESOURCE = "src/main/java/homeworks/lesson41/resource/";

    public static void main(String[] args) throws RuntimeException {

        Person aa = new Person(1, "Abbas", "Hasanli", "45t54");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String a = objectMapper.writeValueAsString(aa);
            System.out.println(a);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "person.ser")))) {
            oos.writeObject(aa);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(RESOURCE + "person.ser")));
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}


