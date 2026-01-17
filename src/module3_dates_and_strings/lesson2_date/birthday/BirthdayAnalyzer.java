package module3_dates_and_strings.lesson2_date.birthday;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class BirthdayAnalyzer {

    private final LocalDate birthDate;
    private static final DateTimeFormatter INPUT_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter OUTPUT_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public BirthdayAnalyzer(String inputDate) {
        this.birthDate = LocalDate.parse(inputDate, INPUT_FORMATTER);
    }

    // Возвращает возраст в полных годах
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }

    // Возвращает день недели рождения словом на русском (например, "среда")
    public String getBirthDayOfWeek() {
        DayOfWeek day = birthDate.getDayOfWeek();
        return switch (day) {
            case MONDAY -> "понедельник";
            case TUESDAY -> "вторник";
            case WEDNESDAY -> "среда";
            case THURSDAY -> "четверг";
            case FRIDAY -> "пятница";
            case SATURDAY -> "суббота";
            case SUNDAY -> "воскресенье";
        };
    }

    // Возвращает ближайшую дату дня рождения (в этом или следующем году)
    public LocalDate getNextBirthday() {
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();

        // Создаём дату дня рождения в текущем году
        LocalDate thisYearsBirthday = birthDate.withYear(currentYear);

        // Если она уже прошла — берём следующий год
        if (thisYearsBirthday.isBefore(today) || thisYearsBirthday.isEqual(today)) {
            return birthDate.withYear(currentYear + 1);
        } else {
            return thisYearsBirthday;
        }
    }

    // Возвращает количество дней до следующего дня рождения
    public long getDaysUntilNextBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = getNextBirthday();
        return ChronoUnit.DAYS.between(today, nextBirthday);
    }

    // Форматированная строка даты следующего ДР
    public String getNextBirthdayFormatted() {
        return getNextBirthday().format(OUTPUT_FORMATTER);
    }

    // День недели следующего ДР
    public String getNextBirthdayDayOfWeek() {
        DayOfWeek day = getNextBirthday().getDayOfWeek();
        return switch (day) {
            case MONDAY -> "в понедельник";
            case TUESDAY -> "во вторник";
            case WEDNESDAY -> "в среду";
            case THURSDAY -> "в четверг";
            case FRIDAY -> "в пятницу";
            case SATURDAY -> "в субботу";
            case SUNDAY -> "в воскресенье";
        };
    }
}
