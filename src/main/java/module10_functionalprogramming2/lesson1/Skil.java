package module10_functionalprogramming2.lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Skil {
    public static void main(String[] args) {

        Stream<String> streamEmpty = Stream.empty(); // Пустой поток
        Stream<String> streamOfArray = Stream.of("a", "b", "c"); // Создание потока из массива

        List<Double> doubleList = List.of(1d, 2d, 3d);
        Stream<Double> streamOfCollection = doubleList.stream();

        String[] array = {"x", "y", "z"};
        Stream<String> streamArr = Arrays.stream(array);

        Stream<Double> stream = Stream.generate(Math::random).limit(10); // Бесконечный поток случайных чисел
        stream.forEach(System.out::println);

        IntStream.range(0, 10).forEach(System.out::println);
//        for (int i = 0; i < 10; i++) {
//        }
    }
}
