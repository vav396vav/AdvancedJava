package module4_advanced_oop.lesson4_abstractclass.company.employees;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("Ivan",
                100, new BigDecimal(300));

        PieceWorker worker = new PieceWorker("John",
                100, new BigDecimal("100.00"));

        System.out.println(employee.getInfo());
        System.out.println("Зарплата: " + employee.calculateSalary());
        System.out.println(worker.getInfo());
        System.out.println("Зарплата: " + worker.calculateSalary());
    }
}
