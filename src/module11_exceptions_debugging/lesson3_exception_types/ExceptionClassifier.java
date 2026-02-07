package module11_exceptions_debugging.lesson3_exception_types;

import java.util.List;

public class ExceptionClassifier {
    public static void main(String[] args) {
        // Создаём список данных: каждый элемент — строка с информацией об исключении
        List<String> exceptionsInfo = List.of(
                "ArithmeticException -> unchecked (причина: ошибка программиста)",
                "IOException -> checked (причина: ошибка внешней среды)",
                "NullPointerException -> unchecked (причина: обращение к null)",
                "ParseException -> checked (причина: некорректный формат входных данных)",
                "IndexOutOfBoundsException -> unchecked (причина: выход за границы коллекции)",
                "ClassNotFoundException -> checked (причина: класс не найден во время выполнения)"
        );

        // Выводим каждую строку в консоль
        exceptionsInfo.forEach(System.out::println);
    }
}