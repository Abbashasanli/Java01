package homeworks.lesson28;

public final class Student implements Comparable<Student> {
   public final String  name;
   public final double grade;
   public final int id;

    public Student(String name, double grade, int id) {
        this.name = name;
        this.grade = grade;
        this.id = id;
    }



    @Override
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', grade=%s, id=%d}", name, grade, id);
    }
}
