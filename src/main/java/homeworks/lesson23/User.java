package homeworks.lesson23;

import java.util.Objects;

public class User {
    private Boolean active;
    private Integer age;
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("User{active=%s, age=%d, name='%s'}", active, age, name);
    }
}
