package module3_dates_and_strings.lesson5_string;

import java.util.Scanner;

public class ProductCodeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите код товара в таком формате (BOOK_12345_v2.txt): ");
        String code = scanner.nextLine();

        if (code.isEmpty()) {
            System.out.println("Код товара не может быть пустым!");
            return;
        }

        int firstUnderscoreIndex = code.indexOf('_');
        int secondUnderscoreIndex = code.indexOf('_', firstUnderscoreIndex + 1);
        int dotIndex = code.indexOf('.');

        // Проверяем наличие всех необходимых символов и их порядок
        if (firstUnderscoreIndex == -1 ||
                secondUnderscoreIndex == -1 ||
                dotIndex == -1 ||
                dotIndex < secondUnderscoreIndex) {
            System.out.println("Некорректный формат кода товара");
            return;
        }

        String type = code.substring(0, firstUnderscoreIndex);
        String id = code.substring(firstUnderscoreIndex + 1, secondUnderscoreIndex);
        String version = code.substring(secondUnderscoreIndex + 1, dotIndex);
        String extension = code.substring(dotIndex + 1);

        System.out.println("Тип: " + type);
        System.out.println("Идентификатор: " + id);
        System.out.println("Версия: " + version);
        System.out.println("Расширение: " + extension);
    }
}