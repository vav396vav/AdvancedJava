package module2_separateobjecttypes.lesson3_bigDecimal;

import java.util.Objects;

public class SafeCalculator {
    private double first;
    private double second;

    public SafeCalculator(double first, double second) {
        this.first = first;
        this.second = second;
    }
    public double getSum(){
        return first + second;
    }

    public double getDifference(){
        return first - second;
    }

    public boolean isSumEEgualTo(double expected){
        // Вычисляем сумму
        double actualSum = getSum();
        // Определяем допустимую погрешность (точность)
        double epsilon = 1e-9;
        // Сравниваем, насколько близко actualSum к expected
        return Math.abs(actualSum - expected) < epsilon;
    }

    public boolean isResultNan(){
        if (Double.isNaN(getSum())){
            return true;
        } else {
            return false;
        }
    }

    public boolean isResultNaN() {
        // Проверяем, является ли сумма значением NaN (Not-a-Number)
        return Double.isNaN(getSum());
    }

    public boolean isResultInfinite() {
        // Проверяем, является ли сумма значением Infinity или -Infinity
        return Double.isInfinite(getSum());
    }

    @Override
    public String toString() {
        return "SafeCalculator{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SafeCalculator that)) return false;
        return Double.compare(first, that.first) == 0 && Double.compare(second, that.second) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
