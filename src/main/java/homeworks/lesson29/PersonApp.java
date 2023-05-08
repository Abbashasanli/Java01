package homeworks.lesson29;

import java.util.Arrays;
import java.util.Comparator;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person(1, "Asif", 23, 340),
                new Person(2, "Arif", 34, 450),
                new Person(3, "Ziya", 34, 560)
        };
        Arrays.sort(persons);
        Arrays.sort(persons, (person1, person2) -> Double.compare(person1.salary, person2.salary));
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Integer.compare(person2.age, person1.age);
            }
        });


    }


}

