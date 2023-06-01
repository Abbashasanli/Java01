package homeworks.lesson41;

import java.io.Serializable;

public final class Person implements Serializable {

    public static final long serialVersionUID = 53;
    public long id;
    public String name;
    public String surname;
    public transient String password;

    public Person() {
    }

    public Person(long id, String name, String surname, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s', surname='%s', password='%s'}", id, name, surname, password);
    }
}
