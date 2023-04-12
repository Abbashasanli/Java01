package homeworks.lesson17.Encapsulation;


import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student student=new Student(20,"Abbas",new String[]{"Math","Physics"});
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(Arrays.toString(student.getCourses()));
    }
}
