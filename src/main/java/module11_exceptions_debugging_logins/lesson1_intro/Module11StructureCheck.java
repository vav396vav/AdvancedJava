package module11_exceptions_debugging_logins.lesson1_intro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Module11StructureCheck {
    private static final Logger log = LoggerFactory.getLogger(Module11StructureCheck.class);

    public static void main(String[] args) {

        log.info("Запуск проверки структуры модуля 11");

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

        log.info("Структура проекта для модуля 11 готова к работе");
        log.debug("Дебаг пишется в консоль");

    }
}
