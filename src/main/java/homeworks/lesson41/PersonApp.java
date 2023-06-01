package homeworks.lesson41;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonApp {

    public static final String RESOURCE = "src/main/java/homeworks/lesson41/resource/";
    public static final Path path = Paths.get(RESOURCE, "people.ser");

    public static void main(String[] args) throws RuntimeException, JsonMappingException {

        final Person abbas = new Person(1, "Abbas", "Hasanli", "45t54");

        ObjectMapper objectMapper = new ObjectMapper();
        String abbasJson;
        try {
            abbasJson = objectMapper.writeValueAsString(abbas);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(abbasJson);

        try {
            Files.writeString(path, abbasJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String personRead;

        try {
            personRead = Files.readString(path);
            System.out.println(personRead);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Person person = objectMapper.readValue(abbasJson, new TypeReference<>() {
            });
            System.out.println(personRead);
            System.out.println(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

