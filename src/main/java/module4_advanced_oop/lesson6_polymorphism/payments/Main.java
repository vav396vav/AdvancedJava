package module4_advanced_oop.lesson6_polymorphism.payments;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Payable card = new BankCardPayment();
        Payable crypto = new CryptoPayment();

        System.out.println("Тип платежа: " + card.getPaymentType());
        System.out.println("Тип платежа: " + crypto.getPaymentType());

        boolean result1 = card.processPayment(new BigDecimal("1000"));
        boolean result2 = crypto.processPayment(new BigDecimal("1000"));

        System.out.println("Успешно: " + result1);
        System.out.println("Успешно: " + result2);
    }
}
