package module6_advaced_collections.lesson2_iterator_iterable.iterator;

import java.util.ArrayList;
import java.util.List;

import static module6_advaced_collections.lesson2_iterator_iterable.iterator.NumberFilter.removeOddNumbers;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Оставшиеся числа:" + removeOddNumbers(list));
    }
}
