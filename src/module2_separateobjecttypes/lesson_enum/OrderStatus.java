package module2_separateobjecttypes.lesson_enum;

public enum OrderStatus {
    PENDING("Заказ ожидает подтверждения "),
    COMPLETED("Заказ подтвержден "),
    SHIPPED("Заказ отправлен "),
    DELIVERED("Заказ доставлен "),
    CANCELLED("Заказ отменен ");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
