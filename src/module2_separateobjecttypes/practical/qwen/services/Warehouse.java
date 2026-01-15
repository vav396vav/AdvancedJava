package module2_separateobjecttypes.practical.qwen.services;

import module2_separateobjecttypes.practical.qwen.model.Product;

import java.math.BigDecimal;

public class Warehouse {
    private Product[] products;

    public Warehouse(Product[] products) {
        this.products = products;
    }

    public BigDecimal getTotalInventoryValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : products) {
            total = total.add(product.getTotalPrice());
        }
        return total;
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
