package homeworks.lesson19;

import java.util.Objects;

public class Person {
    private int age;
    private double budget;

    public Person(int age, double budget) {
        this.age = age;
        this.budget = budget;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

 //   @Override
 // public String toString() {
 //     return String.format("Person{age=%d, budget=%s}", age, budget);
 // }

   @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;
     Person person = (Person) o;
     return age == person.age && Double.compare(person.budget, budget) == 0;
 }

    @Override
    public int hashCode() {
        return Objects.hash(age, budget);
    }
}
