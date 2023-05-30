package homeworks.lesson41;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Person1App {
    public static void main(String[] args) throws NoSuchFieldException {
        Person person = new Person(123, "Alex", "Johnson", "13345");

        String name = person.getClass().getName();
        System.out.println(name);

        Field[] fields = person.getClass().getFields();
        System.out.println(Arrays.toString(fields));

        Method[] declaredMethods = person.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));

        Constructor<?>[] constructors = person.getClass().getConstructors();
        System.out.println(Arrays.toString(constructors));

        Class<?>[] interfaces = person.getClass().getInterfaces();
        System.out.println(Arrays.toString(interfaces));

    }
}
