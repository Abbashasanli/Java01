package homeworks.lesson17.Encapsulation;

public class Student {
    private int age;
    private String name;
    private String[]courses;

    public Student(int age, String name, String[] courses) {
        this.age = age;
        this.name = name;
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
