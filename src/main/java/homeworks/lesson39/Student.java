package homeworks.lesson39;

import java.util.Objects;

public class Student {
    public int age;
    public String name;
    public double grade;

    public Student(int age, String name, double grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.grade, grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, grade);
    }

    @Override
    public String toString() {
        return String.format("Student{age=%d, name='%s', grade=%s}", age, name, grade);
    }
}
