package homeworks.happyfamily;

public class HappyFamilyApp {
    public static void main(String[] args) {
        String []habits=new String[]{"playing with water","cathing ball"};
        String[]schedule=new String[]{"going work","cooking meal"};
        Human Mother = new Human("Nigar","Mahmudova",1972);
        Human Father = new Human("Vaqif","Mahmudov",1967);
        Pet dog=new Pet("Golden","Tobby",3,60,habits);
        Human Son =new Human("Eli","Mahmudov",1995,120,dog,Mother,Father,schedule);
        System.out.println(Son.toString());
        System.out.println(Mother.toString());
        System.out.println(Father.toString());
        System.out.println(dog.toString());


    }
}
