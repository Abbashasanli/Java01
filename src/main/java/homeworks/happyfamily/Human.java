package homeworks.happyfamily;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[]schedule;
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year,  Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("Hello,"+pet);
    }
    public void describePet(){
        System.out.println("I have a pet., he is"+pet.getAge()+"years old, he is"+(pet.getTrickLevel()>50 ? "very sly":"almost not sly"));
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, pet=%s, mother=%s, father=%s, schedule=%s}", name, surname, year, iq, pet, mother, father, Arrays.toString(schedule));
    }

}
