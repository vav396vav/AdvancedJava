package module4_advanced_oop.lesson4_abstractclass.company.employees;

import lombok.Getter;

import java.math.BigDecimal;

public abstract class Employee {
    protected String name;
    public Employee(String name) {
        this.name = name;
        this.id = System.nanoTime();
    }

    @Getter
    private long id;

    public abstract BigDecimal calculateSalary();

    public String getInfo() {
        return "Сотрудник: " + name + ", id: " + id;
    }
}
