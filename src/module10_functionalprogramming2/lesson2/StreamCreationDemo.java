package module10_functionalprogramming2.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> list = List.of("Алексей", "Александр", "Виктория", "Иван");
        List<String> streamList = list.stream()
                .filter(name -> name.length() > 7)
                .map(String::toUpperCase)
                .toList();

        System.out.println("Проверка " + streamList);

        Integer[] array = {1, 2, 3, 4, 5};
        Stream<Integer> streamArray = Arrays.stream(array);
        streamArray.filter(i -> i > 3)
                .map(i -> i * 2)
                .forEach(System.out::println);

        Stream<Double> streamDouble = Stream.of(1.1, 2.2, 3.3);
        streamDouble.forEach(System.out::println);

        Stream<String> streamEmpty = Stream.empty();
        streamEmpty.forEach(System.out::println);

        Optional<String> opt = Optional.of("текст");
        Stream<String> stream = opt.stream();
        stream.forEach(System.out::println);
    }
}
