package module10_functionalprogramming2.lesson5_parallel_reduce;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Employee {

    private final int salary;
    private final LocalDate hiringDate;

    public Employee(int salary, LocalDate hiringDate) {
        this.salary = salary;
        this.hiringDate = hiringDate;
    }

}
