package module3_dates_and_strings.lesson2_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Создаем сегодняшнюю дату
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2026, 1, 15); // год, месяц, день

        // Получаем данные о дате
        int year = date.getYear();
        Month month = date.getMonth(); // возвращает enum Month
        int day = date.getDayOfMonth();
        DayOfWeek dow = date.getDayOfWeek(); // enum: MONDAY, TUESDAY...

        // Изменяем дату
        LocalDate tomorrow = today.plusDays(1);
        LocalDate lastWeek = today.minusWeeks(1);
        LocalDate nextMonth = today.plusMonths(1);

        // Сравниваем даты
        LocalDate date1 = LocalDate.of(2021, 1, 1);
        LocalDate date2 = LocalDate.of(2021, 1, 1);
        boolean isAfter = date1.isAfter(date2); // после этого
        boolean isBefore = date1.isBefore(date2); // до этого
        boolean isEqual = date1.isEqual(date2); // равны

        // Создаем форматтер даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // Создаем дату
        LocalDate java21 = LocalDate.parse("21.05.2021", formatter);
        System.out.println(java21);
        // Выводим дату в нужном формате
        System.out.println(java21.format(formatter));
        // Выводим текущую дату
        LocalDate now = LocalDate.now();

        LocalDate loanContractDate = LocalDate.of(2025, 1, 31);
        System.out.println("Дата заключения договора: " + loanContractDate);
        for (int i = 1; i < 13; i++) {
            LocalDate date3 = loanContractDate.plusMonths(i);
            System.out.println("Платёж №" + i + ": " + date.format(formatter));
        }

        LocalDate today1 = LocalDate.of(2025, Month.NOVEMBER, 1);

    }
}
