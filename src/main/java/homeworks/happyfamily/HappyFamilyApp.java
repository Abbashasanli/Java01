package homeworks.happyfamily;

public class HappyFamilyApp {
    public static void main(String[] args) {
        String[] schedule1 = new String[]{"walking", "cooking "};
        String[] schedule2 = new String[]{String.valueOf(DayofWeek.Monday), "Working"};
        String[] habits = new String[]{"Running", "Swimming"};
        Human Mom = new Human("Nigar", "Eyvazli", 1967, 100, schedule1);
        Human Father = new Human("Vaqif", "Eyvazli", 1963, 125, schedule2);

        }


    }

