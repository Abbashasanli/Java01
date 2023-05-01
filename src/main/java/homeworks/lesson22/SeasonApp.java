package homeworks.lesson22;

public class SeasonApp {
    public static void main(String[] args) {
        String summer = Season.getSummer();
        System.out.println(summer);
        System.out.println(Season1.Autumn);
        System.out.println(Season1.Spring.getTemp());
        System.out.println(Season1.Summer.ordinal());
        System.out.println(Season1.Winter.name());

    }
}
