package module4_advanced_oop.lesson4_abstractclass.company.employees;

import java.math.BigDecimal;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private BigDecimal hourlyRate;

    public HourlyEmployee(String name, int hoursWorked, BigDecimal hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public BigDecimal calculateSalary() {
        return hourlyRate.multiply(BigDecimal.valueOf(hoursWorked));
    }
}
