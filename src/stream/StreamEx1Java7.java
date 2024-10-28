package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamEx1Java7 {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.calories() < 400) {
                menu.add(dish);
            }
        }

        Collections.sort(menu, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.calories(), o2.calories());
            }
        });

        System.out.println(menu);

        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish dish : menu) {
            lowCaloricDishesName.add(dish.name());
        }



    }


}
