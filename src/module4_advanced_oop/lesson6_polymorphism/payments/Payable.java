package module4_advanced_oop.lesson6_polymorphism.payments;

import java.math.BigDecimal;

public interface Payable {

    boolean processPayment(BigDecimal amount);

    String getPaymentType();

}
