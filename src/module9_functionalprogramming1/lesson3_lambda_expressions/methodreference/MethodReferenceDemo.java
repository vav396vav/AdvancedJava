package module9_functionalprogramming1.lesson3_lambda_expressions.methodreference;

import java.util.*;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // Исходные данные
        List<String> words = Arrays.asList("яблоко", "банан", "вишня", "груша");
        List<Integer> numbers = Arrays.asList(10, -5, 0, 100, -20);

        // === Часть 1: Вывод в консоль с помощью ссылки на метод ===
        System.out.println("Слова:");
        words.forEach(System.out::println);

        System.out.println("\nЧисла:");
        numbers.forEach(System.out::println);

        // === Часть 2: Копирование в новые списки с помощью ссылки на метод ===

        // Новый список для строк
        List<String> copiedWords = new ArrayList<>();
        words.forEach(copiedWords::add);  // ← ссылка на метод add

        // Новый список для чисел
        List<Integer> copiedNumbers = new ArrayList<>();
        numbers.forEach(copiedNumbers::add);  // ← ссылка на метод add

        // Вывод результатов
        System.out.println("\nСкопированные слова: " + copiedWords);
        System.out.println("Скопированные числа: " + copiedNumbers);
    }
}