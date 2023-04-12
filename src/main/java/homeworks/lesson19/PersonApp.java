package homeworks.lesson19;

public class PersonApp {
    public static void main(String[] args) {
        Person abbas = new Person(20, 200);
        System.out.println(abbas);
        Person ramil = new Person(21, 500);
        System.out.println(ramil);
        System.out.println(abbas==ramil);
        Person asif = new Person(21, 500);
       boolean a=ramil.equals(asif);
        System.out.println(a);
        System.out.println(abbas.hashCode());
        System.out.println(ramil.hashCode());
        System.out.println(asif.hashCode());

    }
}
