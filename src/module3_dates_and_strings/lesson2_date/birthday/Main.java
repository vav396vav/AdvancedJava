package module3_dates_and_strings.lesson2_date.birthday;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату рождения в формате дд.мм.гггг: ");
        String input = scanner.nextLine();

        // Создаём анализатор — если формат неверный, программа упадёт (это допустимо на данном этапе)
        BirthdayAnalyzer analyzer = new BirthdayAnalyzer(input);

        System.out.println("Вам " + analyzer.getAge() + " лет.");
        System.out.println("Вы родились в " + analyzer.getBirthDayOfWeek() + ".");

        String nextDate = analyzer.getNextBirthdayFormatted();
        String nextDay = analyzer.getNextBirthdayDayOfWeek();
        long daysLeft = analyzer.getDaysUntilNextBirthday();

        System.out.println("Ваш следующий день рождения — " + nextDate + " (" + nextDay + ").");
        System.out.println("До него осталось " + daysLeft + " дней.");
    }
}