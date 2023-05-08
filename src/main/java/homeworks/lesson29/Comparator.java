package homeworks.lesson29;

public class Comparator implements java.util.Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.name!=person2.name){
            return person1.name.compareTo(person2.name);
        }else if (person1.age!= person2.age){
            return Integer.compare(person1.age, person2.age);
        }return Double.compare(person2.salary, person1.salary);


    }
}
