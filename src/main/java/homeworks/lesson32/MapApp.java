package homeworks.lesson32;

import java.util.HashMap;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("Elvin","1234");
        data.put("Arif","6541");
        data.put(null,"5456");
        data.put(null ,"jnjnj");
        data.put(null,null);
        Boolean a=data.containsValue(data);
        System.out.println(a);
        data.remove("Arif","6541");
        System.out.println(data);
        data.replace("Elvin","1234","7667");
        System.out.println(data);
        HashMap<Integer, String> datanames = new HashMap<>();


    }
}
