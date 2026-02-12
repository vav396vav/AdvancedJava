package module2_separateobjecttypes.lesson4_record.medium;

public record OrderItem(String productName, double unitPrice, int quantity) {

    public OrderItem(String productName, double unitPrice, int quantity) {
        if (productName == null || productName.isEmpty()){
            System.out.println("Имя не может быль null и пустым");
        }
        if (unitPrice < 0) {
            System.out.println("Цена не может быть отрицательной ");
        }
        if (quantity < 1) {
            System.out.println("Количество должно быть не меньше 1");
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return unitPrice * quantity;
    }
    public String getFormattedInfo() {
        return "\"" + "Товар: " + productName + ", Цена: " + unitPrice +
                ", Количество: " + quantity + ", Общая цена: " + getTotalPrice();
    }

    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem("Яблоки", 100, 5);
        System.out.println(orderItem.getFormattedInfo());
    }
}
