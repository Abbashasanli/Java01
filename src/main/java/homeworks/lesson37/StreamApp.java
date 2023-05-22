package homeworks.lesson37;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApp {
    public static void main(String[] args) {

        List<Integer> evenNums = new Random()
                .ints(20, 1, 50)
                .filter(num -> num % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(evenNums);
        Set<Integer> set = evenNums
                .stream()
                .filter(num -> num > 10 && num < 30)
                .collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(search(evenNums,22));


    }

    public static <T> T search(Collection<T> collection, T data) {
        return collection.stream()
                .filter(element -> element
                        .equals(data))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Data not found"));
    }


}
