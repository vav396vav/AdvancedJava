package lesson3.bigDecimalмодуль;

import java.math.BigDecimal;

public class Lesson {

    // Создание
    BigDecimal bd1 = new BigDecimal("0.1"); // ✅ Рекомендуется
    BigDecimal bd2 = new BigDecimal(0.1);   // ❌ Не рекомендуется — может содержать ошибку

    // Операции
    BigDecimal a = new BigDecimal("0.1");
    BigDecimal b = new BigDecimal("0.2");

    BigDecimal sum = a.add(b);          // Прибавление 0.3
    BigDecimal diff = a.subtract(b);    // Вычесть -0.1
    BigDecimal mul = a.multiply(b);     // Умножение 0.02
    BigDecimal div = a.divide(b);       // Деление 0.5 (но требует указания scale и режима округления)

    //Спецзначения: NaN, Infinity
    //NaN — "Not a Number", например: 0.0 / 0.0
    //Infinity — результат деления на 0: 1.0 / 0.0
//    double value = 0.0 / 0.0;
//            System.out.println(Double.isNaN(value));     // true
//            System.out.println(Double.isInfinite(value)); // false
//
//    value = 1.0 / 0.0;
//            System.out.println(Double.isInfinite(value)); // true

//    //Сравнение
//    double a = 0.1 + 0.2;
//    double b = 0.3;
//    double epsilon = 1e-9;
//
//    if (Math.abs(a - b) < epsilon) {
//        System.out.println("Числа равны");
    //проба
    //
    //
    //

}
