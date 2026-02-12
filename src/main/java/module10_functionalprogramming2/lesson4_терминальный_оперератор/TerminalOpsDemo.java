package module10_functionalprogramming2.lesson4_терминальный_оперератор;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOpsDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, -5, 3, 10, 0, -2);

        List<Integer> positiveNumbers = list.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
        System.out.println("Положительные числа: " + positiveNumbers + "\n");

        long countedPositiveNumbers = positiveNumbers.stream()
                .count();
        System.out.println("Количество положительных чисел: " + countedPositiveNumbers + "\n");

        boolean equality = list.stream()
                .anyMatch(i -> i == 100);
        System.out.println("Есть ли в списке число 100? " + equality + "\n");

        int sum = list.stream()
                .reduce(0,Integer::sum);
        System.out.println("Сумма всех чисел: " + sum + "\n");

        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);
        int maxValue = max.orElse(Integer.MIN_VALUE);
        System.out.println("Максимальное число: " + maxValue + "\n");
        System.out.println("Максимальное число: " + max + "\n");

    }
}
