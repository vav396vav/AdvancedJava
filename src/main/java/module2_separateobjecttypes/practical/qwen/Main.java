package module2_separateobjecttypes.practical.qwen;

import module2_separateobjecttypes.practical.qwen.enums.ProductCategory;
import module2_separateobjecttypes.practical.qwen.model.Product;
import module2_separateobjecttypes.practical.qwen.services.Warehouse;
import module2_separateobjecttypes.practical.qwen.utils.ProductValidator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

//        Product[] products = {
//                 new Product("Ноутбук", new BigDecimal("99999.99"),
//                5, ProductCategory.ELECTRONICS),
//                 new Product(" ", new BigDecimal("45"),
//                20, ProductCategory.FOOD)
//        };

        // Создаём товары
        Product laptop = new Product("Ноутбук", new BigDecimal("99999.99"),
                5, ProductCategory.ELECTRONICS);
        Product bread = new Product(" ", new BigDecimal("45"),
                20, ProductCategory.FOOD);


        // Добавляем товары в массив
        Product[] products = { laptop, bread };

        // Проверяем цены
        double testPrice = 100.0 / 0.0; // Infinity
        System.out.println("Цена корректна: " + ProductValidator.isValidPrice(testPrice));


        // Создаём склад
        Warehouse warehouse = new Warehouse(products);

        // Выводим товары
        warehouse.printProducts();

        // Выводим общую стоимость
        System.out.println("Общая стоимость: " + warehouse.getTotalInventoryValue());
    }
}