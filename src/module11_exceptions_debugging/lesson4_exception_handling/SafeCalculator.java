package module11_exceptions_debugging.lesson4_exception_handling;

import java.util.ArrayList;

public class SafeCalculator {
    public static void main(String[] args) {
        // Операция 1: деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "без дополнительного сообщения";
            }
            System.out.println("Ошибка в операции 1: " + e.getClass().getSimpleName() + " – " + message);
        }

        // Операция 2: преобразование строки в число
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "без дополнительного сообщения";
            }
            System.out.println("Ошибка в операции 2: " + e.getClass().getSimpleName() + " – " + message);
        }

        // Операция 3: получение элемента из пустого списка
        try {
            ArrayList<Integer> list = new ArrayList<>();
            int value = list.get(0);
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "без дополнительного сообщения";
            }
            System.out.println("Ошибка в операции 3: " + e.getClass().getSimpleName() + " – " + message);
        }

        // Завершение
        System.out.println("Все операции завершены");
    }
}