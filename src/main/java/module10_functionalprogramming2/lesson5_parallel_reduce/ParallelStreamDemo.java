package module10_functionalprogramming2.lesson5_parallel_reduce;

import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("A", "B", "C", "D", "E", "F");

        System.out.println("Последовательный Stream:");
        strings
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Параллельный Stream:");
        strings.parallelStream()
                .forEach(System.out::println);
    }
}
