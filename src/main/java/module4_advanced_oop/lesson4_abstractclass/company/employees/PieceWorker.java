package module4_advanced_oop.lesson4_abstractclass.company.employees;

import java.math.BigDecimal;

public class PieceWorker extends Employee {
    private int unitsProduced;
    private BigDecimal ratePerUnit;

    public PieceWorker(String name, int unitsProduced, BigDecimal ratePerUnit) {
        super(name);
        this.unitsProduced = unitsProduced;
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    public BigDecimal calculateSalary() {
        return ratePerUnit.multiply(BigDecimal.valueOf(unitsProduced));
    }
}
