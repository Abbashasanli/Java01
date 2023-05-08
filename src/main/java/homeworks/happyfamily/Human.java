package homeworks.happyfamily;

import java.util.Arrays;
import java.util.Objects;

public final class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;

    private String[]schedule;
    private Family family;
    public void greetPet(){
        System.out.println("Hello,"+"pet");
    }
    public void describePet(){
        System.out.println("I have a pet., he is"+"pet.getAge()+years old, he is+(pet.getTrickLevel()>50 ? very sly:almost not sly");
    }

    public Human(String name, String surname, int year,Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family=family;
    }




    public Human(String name, String surname, int year, int iq,  String[] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}", name, surname, year, iq, Arrays.toString(schedule));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
