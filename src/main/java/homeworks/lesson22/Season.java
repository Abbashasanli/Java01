package homeworks.lesson22;

public final class Season {
    private static final String Spring="Spiring";
    private static final String Summer="Summer";
    private static final String Autumn="Autumn";
    private static final String Winter="Winter";

    private Season() {
    }

    public String getSpring() {
        return Spring;
    }

    public static String getSummer() {
        return Summer;
    }

    public static String getAutumn() {
        return Autumn;
    }

    public static String getWinter() {
        return Winter;
    }
}
