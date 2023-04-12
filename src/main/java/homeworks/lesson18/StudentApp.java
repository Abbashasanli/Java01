package homeworks.lesson18;

public class StudentApp  {
    public static void main(String[] args) {
        Student student = new Student(20, 78);
        System.out.println(student.getAge());
        System.out.println(student.getGrade());
        System.out.println(student);
    }
}
