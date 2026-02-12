package module5_collections.lesson6_hashmap.price_catalog;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PriceCatalog catalog = new PriceCatalog();

        catalog.addPrice("Хлеб", new BigDecimal("50.00"));
        catalog.addPrice("Молоко", new BigDecimal("85.00"));
        catalog.addPrice("Сыр", new BigDecimal("350.00"));

        System.out.println("Цена на Молоко: " + catalog.getPrice("Молоко"));

        System.out.println("Есть ли Колбаса? " + catalog.hasProduct("Колбаса"));

        catalog.printAllPrices();
    }
}
