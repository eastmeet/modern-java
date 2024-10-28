package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx1Java8 {
    public static void main(String[] args) {
        Dish bread = new Dish("bread", 399);
        Dish rice = new Dish("rice", 300);
        Dish chicken = new Dish("chicken", 400);
        List<Dish> menu = new ArrayList<>(List.of(bread, rice, chicken));

        List<String> list = menu.stream()
                .filter(d -> d.calories() < 400)
                .sorted(Comparator.comparing(Dish::calories))
                .map(Dish::name)
                .toList();

        System.out.println(list);

        List<String> parallelList = menu.parallelStream()
                .filter(d -> d.calories() < 400)
                .sorted(Comparator.comparing(Dish::calories))
                .map(Dish::name)
                .toList();

        System.out.println(parallelList);


    }


}
