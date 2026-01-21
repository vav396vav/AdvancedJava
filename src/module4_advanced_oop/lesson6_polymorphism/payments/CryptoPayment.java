package module4_advanced_oop.lesson6_polymorphism.payments;

import java.math.BigDecimal;

public class CryptoPayment extends BasePayment{
    @Override
    public boolean processPayment(BigDecimal amount) {
        log("Обработка платежа в криптовалюте, сумма: " + amount);
        return amount.compareTo(BigDecimal.ZERO) > 0;
    }

    @Override
    public String getPaymentType() {
        return "Криптовалюта";
    }
}
