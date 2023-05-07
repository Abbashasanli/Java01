package homeworks.lesson28;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] player = {
                new Player("Smith", 20),
                new Player("Jones", 15),
                new Player("Jones", 20)
        };
     //  System.out.println(Arrays.toString(player));
     // Arrays.sort(player);
     //  System.out.println(Arrays.toString(player));
     //  System.out.println(".....");
        System.out.println(Arrays.toString(player));
        Arrays.sort(player,new PlayerScoreDescComparator());
        System.out.println(Arrays.toString(player));
       Arrays.sort(player,new PlayerNameDescComparator());
        System.out.println(Arrays.toString(player));
        Arrays.sort(player, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return 0;
            }
        });
    }
}
