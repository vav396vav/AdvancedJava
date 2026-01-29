package module9_functionalprogramming1.lesson3_lambda_expressions.validator;

import java.time.LocalDate;

public class ValidationDemo {
    public static void main(String[] args) {

        // 1. Лямбда для проверки положительного целого числа
        DataValidator<Integer> positiveNumberChecker = number -> number > 0;

        // 2. Лямбда для проверки непустой строки (с защитой от null)
        DataValidator<String> nonEmptyStringChecker = str -> str != null && !str.isEmpty();

        // 3. Лямбда для проверки даты: не позже сегодняшнего дня
        DataValidator<LocalDate> pastOrTodayDateChecker = date ->
                !date.isAfter(LocalDate.now());

        // === Тестирование чисел ===
        System.out.println("[Число] 5 → валидно: " + positiveNumberChecker.isValid(5));
        System.out.println("[Число] -3 → валидно: " + positiveNumberChecker.isValid(-3));
        System.out.println("[Число] 0 → валидно: " + positiveNumberChecker.isValid(0));
        System.out.println("[Число] 100 → валидно: " + positiveNumberChecker.isValid(100));

        // === Тестирование строк ===
        System.out.println("[Строка] \"привет\" → валидно: " + nonEmptyStringChecker.isValid("привет"));
        System.out.println("[Строка] \"\" → валидно: " + nonEmptyStringChecker.isValid(""));
        System.out.println("[Строка] null → валидно: " + nonEmptyStringChecker.isValid(null));
        System.out.println("[Строка] \" \" → валидно: " + nonEmptyStringChecker.isValid(" "));

        // === Тестирование дат ===
        System.out.println("[Дата] 2020-05-15 → валидно: " +
                pastOrTodayDateChecker.isValid(LocalDate.parse("2020-05-15")));
        System.out.println("[Дата] Сегодня → валидно: " +
                pastOrTodayDateChecker.isValid(LocalDate.now()));
        System.out.println("[Дата] 2030-01-01 → валидно: " +
                pastOrTodayDateChecker.isValid(LocalDate.parse("2030-01-01")));
        System.out.println("[Дата] 1990-01-01 → валидно: " +
                pastOrTodayDateChecker.isValid(LocalDate.parse("1990-01-01")));

    }
}