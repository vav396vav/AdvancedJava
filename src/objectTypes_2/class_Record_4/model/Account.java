package objectTypes_2.class_Record_4.model;

import java.math.BigDecimal;

public record Account(String accountId,
                      BigDecimal balance,
                      String ownerName, // Имя владельца
                      Integer age, // Возраст владельца
                      Boolean isActive // Активен ли счет
//                      AccountStatus status
) {

    public Account {
        // Валидация внутри компактного конструктора
        if (accountId == null || !accountId.startsWith("ACC")) { // Добавляем проверку на null и на начало строки
            throw new IllegalArgumentException("ID должен начинаться с 'ACC'");
        }
        if (balance == null || balance.compareTo(BigDecimal.ZERO) < 0) { // Добавляем проверку на null и отрицательное значение
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
        if (ownerName == null || ownerName.isBlank()) { // Добавляем проверку на null и пустое значение
            throw new IllegalArgumentException("Имя владельца не может быть пустым");
        }
        if (age == null || age < 14 || age > 120) { // Добавляем проверку на null и диапазон возраста
            throw new IllegalArgumentException("Возраст должен быть от 14 до 120");
        }
        if (isActive == null) { // Добавляем проверку на null
            throw new IllegalArgumentException("Поле isActive не может быть null");
        }
    }
}
