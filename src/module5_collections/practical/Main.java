package module5_collections.practical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAnalyzer analyzer = new NumberAnalyzer();

        System.out.println("Введите целые числа. Нажмите Enter на пустой строке — завершение ввода.");

        while (true) {
            System.out.print("Число: ");
            String input = scanner.nextLine().trim(); // Читаем всю строку и удаляем пробелы по краям

            if (input.isEmpty()) {
                System.out.println("Ввод завершён.");
                break;
            }


            try {
                int number = Integer.parseInt(input);
                analyzer.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод: '" + input + "'. Введите целое число или оставьте пустым для завершения.");
            }
        }

        analyzer.printAllNumbers();
    }
}

