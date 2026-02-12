package module5_collections.lesson6_hashmap.price_catalog;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PriceCatalog {
    Map<String, BigDecimal> prices = new HashMap<>();

    void addPrice(String productName, BigDecimal price) {
        prices.put(productName, price);
    }

    BigDecimal getPrice(String productName) {
        return prices.get(productName); // get() сам возвращает null, если ключа нет
    }

    boolean hasProduct(String productName) {
        return prices.containsKey(productName);
    }

    void printAllPrices() {
    for (Map.Entry<String, BigDecimal> entry : prices.entrySet()) {
            System.out.println("Товар: " + entry.getKey() + ", Цена: " + entry.getValue());
        }
    }
}
