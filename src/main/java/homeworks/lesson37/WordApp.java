package homeworks.lesson37;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordApp {
    public static void main(String[] args) {
        String word = "GARABAGH";
        HashMap<Character, Integer> count = new HashMap<>();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            Integer counts = count.get(c);
            if (counts == null) {
                count.put(c, 1);
            } else {
                count.put(c, counts + 1);
            }
        }
        System.out.println(count);
        HashMap<Character, Integer> count2 = new HashMap<>();
        for (char c : chars) {
            count2.merge(c, 1, Integer::sum);
        }
        System.out.println(count2);
        Map<Integer, Long> collect = word.chars()
                .boxed()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }

}
