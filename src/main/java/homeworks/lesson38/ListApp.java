package homeworks.lesson38;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListApp {
    public static void main(String[] args) {

        Map<Integer, Long> collect = new Random()
                .ints(100, 0, 25)
                .boxed()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));

        IntSummaryStatistics statistics = collect.keySet()
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        Long Max = collect.get(statistics.getMax());
        Long Min = collect.get(statistics.getMin());
        System.out.println(Max);
        System.out.println(Min);
        System.out.println(collect);
        System.out.println(statistics);

    }
}
