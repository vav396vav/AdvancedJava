package module2_separateobjecttypes.practical.qwen.model;

import module2_separateobjecttypes.practical.qwen.enums.ProductCategory;

import java.math.BigDecimal;

public record Product(String name, BigDecimal price, int quantity, ProductCategory category) {
    public BigDecimal getTotalPrice() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}
