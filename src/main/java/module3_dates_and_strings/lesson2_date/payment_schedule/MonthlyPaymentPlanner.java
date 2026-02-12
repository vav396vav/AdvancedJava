package module3_dates_and_strings.lesson2_date.payment_schedule;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MonthlyPaymentPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        System.out.print("Введите дату подписания договора в формате день.месяц.год (например, 01.01.2024): ");
        String input = scanner.nextLine();
        LocalDate contractSigningDate = LocalDate.parse(input, formatter);

        System.out.print("Введите количество платежей: ");
        int numberOfPayments = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= numberOfPayments; i++) {
            LocalDate nextPayment = contractSigningDate.plusMonths(i);
            System.out.println("Платеж № " + i + ": " + nextPayment.format(formatter));

        }
    }
}
