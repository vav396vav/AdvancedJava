package module2_separateobjecttypes.lesson4_record.hard;

public class Main {
    public static void main(String[] args) {
        InvoiceItem[] items = {
                new InvoiceItem("Хлеб", 45.0, 2),
                new InvoiceItem("Молоко", 80.0, 1),
                new InvoiceItem("Сыр", 300.0, 3)
        };

        Invoice invoice = new Invoice("INV-001", items);

        System.out.println(invoice.getDetailedInfo());
        System.out.println("Общая сумма: " + invoice.getTotalAmount());
    }
}
