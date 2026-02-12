package module2_separateobjecttypes.lesson4_record.hard;


public record Invoice(String invoiceId, InvoiceItem[] items) {

    public Invoice {
        if (invoiceId == null || invoiceId.isEmpty()) {
            System.out.println("Айди не может быть null или пустым");
        }
        if (items == null || items.length == 0) {
            System.out.println("Список товаров не может быть пустым");
        }
    }

    // Возвращает общую сумму всех товаров в счёте
    public double getTotalAmount() {
        double total = 0.0;
        for (InvoiceItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Возвращает детализированную информацию о счёте
    public String getDetailedInfo() {
        String result = "Invoice{id='" + invoiceId + "', totalAmount=" + getTotalAmount() + ", items=[\n";

        for (int i = 0; i < items.length; i++) {
            InvoiceItem item = items[i];
            result += "    Item{name='" + item.productName() + "', totalPrice=" + item.getTotalPrice() + "}";
            if (i < items.length - 1) {
                result += ",";
            }
            result += "\n";
        }

        result += "]}";
        return result;
    }
}
