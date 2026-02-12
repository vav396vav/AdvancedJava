package module2_separateobjecttypes.lesson3_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class PreciseCalculator {

    private final BigDecimal first;
    private final BigDecimal second;

    // Конструктор принимает два double, но сохраняет их как BigDecimal,
    // используя строковое представление, чтобы избежать погрешности double.
    public PreciseCalculator(double first, double second) {
        this.first = new BigDecimal(String.valueOf(first));
        this.second = new BigDecimal(String.valueOf(second));
    }

    // Возвращает сумму двух BigDecimal
    public BigDecimal add() {
        return first.add(second);
    }

    // Возвращает разность (first - second)
    public BigDecimal subtract() {
        return first.subtract(second);
    }

    // Возвращает произведение
    public BigDecimal multiply() {
        return first.multiply(second);
    }

    // Возвращает результат деления с указанным количеством знаков после запятой и режимом округления
    public BigDecimal divide(int scale, RoundingMode mode) {
        return first.divide(second, scale, mode);
    }

    // Проверяет, равна ли сумма ожидаемому значению
    public boolean isSumEqualTo(BigDecimal expected) {
        BigDecimal sum = add();
        return sum.compareTo(expected) == 0; // compareTo возвращает 0, если равны
    }

    // Проверяет, равны ли first и second
    public boolean isEqual() {
        return first.compareTo(second) == 0;
    }

    // Проверяет, больше ли first, чем second
    public boolean isGreater() {
        return first.compareTo(second) > 0;
    }

    // Проверяет, меньше ли first, чем second
    public boolean isLess() {
        return first.compareTo(second) < 0;
    }

    // Переопределяем toString для красивого вывода
    @Override
    public String toString() {
        return "PreciseCalculator{" +
                "first=" + first +
                ", second=" + second +
                ", sum=" + add() +
                '}';
    }

    // Переопределяем equals для сравнения объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PreciseCalculator that)) return false;
        return Objects.equals(first, that.first) &&
                Objects.equals(second, that.second);
    }

    // Переопределяем hashCode
    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}