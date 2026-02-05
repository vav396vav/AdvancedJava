package module10_functionalprogramming2.lesson3_промежуточные_операторы;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpsDemo {
    public static void main(String[] args) {

        List<String> list = List.of("москва", "Москва", "Париж", "париж", "токио", "Рим", "Лондон", "рим");

        Stream<String> stream = list.stream()
                .filter(l -> l.length() >= 4 && l.length() <= 6)
                .map(String::toUpperCase)
                .distinct()
                .sorted();

        List<String> result = stream.collect(Collectors.toList());

        System.out.println("Обработанные данные: " + result);
    }
}
