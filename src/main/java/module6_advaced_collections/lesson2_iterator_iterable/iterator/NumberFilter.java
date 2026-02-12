package module6_advaced_collections.lesson2_iterator_iterable.iterator;

import java.util.Iterator;
import java.util.List;

public class NumberFilter {

    public static List<Integer> removeOddNumbers(List<Integer> numbers) {
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            Integer number = it.next();
            if (number % 2 != 0) {
                it.remove();
            }
        }
        return numbers;
    }
}
