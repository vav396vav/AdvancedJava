package module10_functionalprogramming2.lesson1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroDemo {
    public static void main(String[] args) {

        // 1. Создаём неизменяемый список строк
        List<String> cities = List.of("Москва", "Париж", "Токио", "Лондон", "Рим");

        // 2. Создаём Stream из списка
        Stream<String> cityStream = cities.stream();


        // 3. Строим цепочку промежуточных операций:
        //    - фильтрация: оставляем только города длиной > 4 символов
        //    - преобразование: переводим в верхний регистр
        Stream<String> processedStream = cityStream
                .filter(city -> city.length() > 4)          // промежуточная операция
                .map(String::toUpperCase);                  // промежуточная операция
        System.out.println(processedStream);

        // 4. Выполняем терминальную операцию: собираем результат в новый список
        List<String> result = processedStream.collect(Collectors.toList());

        // 5. Выводим результат в консоль
        System.out.println("Результат обработки: " + result);

        // 6. Демонстрация одноразовости Stream (закомментировано, чтобы программа запускалась)
        // Если раскомментировать — будет ошибка:
        // IllegalStateException: stream has already been operated upon or closed
        // long count = cityStream.count(); // ❌ НЕЛЬЗЯ: cityStream уже использован!
    }
}