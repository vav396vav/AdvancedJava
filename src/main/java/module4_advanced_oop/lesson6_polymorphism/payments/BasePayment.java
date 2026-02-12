package module4_advanced_oop.lesson6_polymorphism.payments;

public abstract class BasePayment implements Payable {
    private String paymentId;

    public BasePayment() {
        this.paymentId = String.valueOf(System.nanoTime());
    }

    @Override
    public abstract String getPaymentType();

    protected void log(String msg){
        System.out.println("Payment " + msg);
    }
}
