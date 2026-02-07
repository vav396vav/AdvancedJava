package module11_exceptions_debugging.lesson1_intro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Module11StructureCheck {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("Текущая дата и время: " + dateTime.format(formatter) + "\n");

        System.out.println("Список пакетов:");
        List<String> packageList = List.of("intro",
                "exceptions.basic",
                "exceptions.handling",
                "exceptions.custom",
                "debugging",
                "logging");
        packageList.forEach(System.out::println);

        System.out.println("\n" + "Структура проекта для модуля 11 готова к работе");

    }
}
