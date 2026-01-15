package module2_separateobjecttypes.lesson4_record.hard;

public record InvoiceItem(String productName, double unitPrice, int quantity) {
    public double getTotalPrice() {
        return unitPrice * quantity;
    }
}
