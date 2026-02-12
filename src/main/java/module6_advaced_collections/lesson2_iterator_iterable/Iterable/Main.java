package module6_advaced_collections.lesson2_iterator_iterable.Iterable;

public class Main {
    public static void main(String[] args) {
        EventLog log = new EventLog();
        EventLog log2 = new EventLog();

        log.addEvent("Пользователь вошёл в систему");
        log.addEvent("Ошибка подключения к базе данных");
        log.addEvent("Файл успешно загружен");
        log.addEvent("Недостаточно прав для доступа");
        log.addEvent("Система обновлена");

        System.out.println(log.getEvents());

        EventFilter.removeEventsContaining(log, "Ошибка");

        for (String event : log) {
            System.out.println(event);
        }
    }
}
