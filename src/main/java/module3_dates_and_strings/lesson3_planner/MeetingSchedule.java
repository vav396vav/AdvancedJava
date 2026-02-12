package module3_dates_and_strings.lesson3_planner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MeetingSchedule {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2050, Month.MARCH, 12);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy - EEEE");
        System.out.println("Начальная дата: " + startDate.format(formatter));

        // вызываем метод и выводим результат
        LocalDate nextThursday = nearThursday(startDate);
        System.out.println("Ближайший четверг: " + nextThursday.format(formatter));

        // дата окончания встреч
        LocalDate endOfEvent = startDate.
                plusMonths(1).
                plusWeeks(2);
        System.out.println("Конец события: " + endOfEvent.format(formatter));

        // выводим встречи
        LocalDate nextMeetingAt = nextThursday;
        while (nextMeetingAt.isBefore(endOfEvent)) {
            System.out.println("Встреча: " + nextMeetingAt.format(formatter));
            nextMeetingAt = nextMeetingAt.plusWeeks(1);
        }
    }



    // Находим ближайший четверг
    private static LocalDate nearThursday(LocalDate date) {
        LocalDate nextDay = date;
        while (!(nextDay.getDayOfWeek().equals(DayOfWeek.THURSDAY))){
            nextDay = nextDay.plusDays(1);
        }
        return nextDay;
    }
}
