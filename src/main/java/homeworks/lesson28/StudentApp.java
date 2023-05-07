package homeworks.lesson28;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Arif", 78, 1),
                new Student("Sahib", 85, 2),
                new Student("Ramil", 77, 3),
                new Student("Cavid", 66, 4)
        };
        // System.out.println(Arrays.toString(students));
        // Arrays.sort(students);
        // System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, (student1, student2) -> student1.name.compareTo(student2.name));
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, (student1, student2) -> Double.compare(student1.grade, student2.grade));
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, (student1, student2) -> Integer.compare(student1.id, student2.id));
        System.out.println(Arrays.toString(students));


    }
}