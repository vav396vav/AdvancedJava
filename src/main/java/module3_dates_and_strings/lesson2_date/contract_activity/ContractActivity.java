package module3_dates_and_strings.lesson2_date.contract_activity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public enum ContractActivity {
    INVALID("Невалидный"),
    ACTIVE("Активный"),
    EXPIRED("Истекший");

    private String status;

    ContractActivity(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Введите дату начало договора: ");
        String date = sc.nextLine();
        LocalDate start = LocalDate.parse(date, formatter);

        System.out.print("Введите дату начало договора: ");
        String date2 = sc.nextLine();
        LocalDate end = LocalDate.parse(date2, formatter);

        LocalDate today = LocalDate.now();

        System.out.println("Сегодня: " + today + "\nНачало договора: " +
                start + "\nКонец договора: " + end + "\n");

        if (today.isBefore(start))
            System.out.println("Статус договора: " + INVALID.getStatus());

        if (today.isEqual(start) || today.isAfter(start) &&
                today.isBefore(end) || today.isEqual(end))
            System.out.println("Статус договора: " + ACTIVE.getStatus());

        if (today.isAfter(end))
            System.out.println("Статус договора: " + EXPIRED.getStatus());


    }
}