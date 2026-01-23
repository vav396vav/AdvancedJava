package module5_collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Программа для анализа ввода целых чисел:
 * - Считывает числа из консоли до пустой строки.
 * - Находит сумму уникальных чисел (встретились ровно 1 раз).
 * - Находит числа, которые повторялись (встретились 2+ раз).
 *
 * Особенности:
 * - Использует только пройденные темы (без исключений!).
 * - Безопасно обрабатывает некорректный ввод (дробные, строки).
 * - Использует коллекции: HashMap, HashSet, ArrayList.
 */
public class UniqueNumbersApp {

    public static void main(String[] args) {
        // Создаём Scanner для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);

        // Карта для подсчёта количества вхождений каждого числа
        // Ключ — число (Integer), значение — сколько раз оно встретилось (Integer)
        Map<Integer, Integer> numberCounts = new HashMap<>();

        System.out.println("Введите целые числа по одному в строке. Пустая строка — завершение.");

        // Бесконечный цикл — будем выходить по условию
        while (true) {
            // Проверяем, есть ли следующая строка
            if (!scanner.hasNextLine()) {
                break; // на случай, если поток закрыт
            }

            // Читаем строку
            String line = scanner.nextLine().trim();

            // Если строка пустая — завершаем ввод
            if (line.isEmpty()) {
                break;
            }

            // Проверяем, является ли строка целым числом
            // Используем вспомогательный метод isInteger()
            if (isInteger(line)) {
                // Преобразуем строку в целое число
                int number = Integer.parseInt(line);

                // Обновляем счётчик для этого числа в карте
                // Если числа ещё не было — кладём 1, иначе увеличиваем текущее значение на 1
                numberCounts.put(number, numberCounts.getOrDefault(number, 0) + 1);
            } else {
                // Выводим подсказку пользователю
                System.out.println("Некорректный ввод: '" + line + "'. Введите целое число.");
            }
        }

        // Закрываем Scanner (хорошая практика, хотя не обязательно для System.in)
        scanner.close();

        // Теперь анализируем данные

        // Список для хранения чисел, которые встретились более одного раза (без дубликатов!)
        Set<Integer> duplicates = new HashSet<>();

        // Переменная для суммы уникальных чисел
        int uniqueSum = 0;

        // Проходим по всем записям в карте (число → количество)
        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count == 1) {
                // Число уникальное — добавляем к сумме
                uniqueSum += number;
            } else if (count > 1) {
                // Число повторяется — добавляем в множество дубликатов
                // Используем Set, чтобы автоматически избежать дубликатов
                duplicates.add(number);
            }
        }

        // Выводим результат

        System.out.println("Сумма уникальных чисел: " + uniqueSum);

        // Преобразуем Set в List, чтобы получить предсказуемый порядок (необязательно, но красивее)
        List<Integer> duplicatesList = new ArrayList<>(duplicates);
        System.out.println("Повторяющиеся числа: " + duplicatesList);
    }

    /**
     * Вспомогательный метод: проверяет, можно ли строку преобразовать в целое число.
     * Работает без исключений!
     *
     * @param str строка для проверки
     * @return true, если строка — корректное целое число (включая отрицательные)
     */
    private static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Проверяем первый символ — может быть '-' для отрицательных чисел
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            // Должно быть хотя бы одно число после '-'
            if (str.length() == 1) {
                return false;
            }
            startIndex = 1;
        }

        // Проверяем, что все остальные символы — цифры
        for (int i = startIndex; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}