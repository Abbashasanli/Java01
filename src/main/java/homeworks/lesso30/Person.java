package homeworks.lesso30;

public class Person implements Comparable<Person>{
    public final int id;
    public final String name;
    public final int age;
    public final double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s', age=%d, salary=%s}", id, name, age, salary);
    }

    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.id, that.id);
    }
}
