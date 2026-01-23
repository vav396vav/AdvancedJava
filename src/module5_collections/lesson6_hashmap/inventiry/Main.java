package module5_collections.lesson6_hashmap.inventiry;

/**
 * Главный класс для демонстрации работы InventoryManager.
 */
public class Main {
    public static void main(String[] args) {
        // Создаём менеджер склада
        InventoryManager manager = new InventoryManager();

        // Добавляем три товара
        manager.addProduct(1001, "Хлеб", 10);
        manager.addProduct(1002, "Молоко", 5);
        manager.addProduct(1003, "Сыр", 3);

        // Увеличиваем остаток хлеба на 2
        manager.increaseStock(1001, 2);

        // Пытаемся уменьшить остаток молока на 7 (должно провалиться)
        boolean successMilk = manager.decreaseStock(1002, 7);
        System.out.println("Попытка списать 7 единиц Молока: " + successMilk);

        // Уменьшаем остаток сыра на 2 (успешно)
        boolean successCheese = manager.decreaseStock(1003, 2);
        System.out.println("Попытка списать 2 единицы Сыра: " + successCheese);

        // Получаем и выводим информацию о молоке
        Product milk = manager.getProduct(1002);
        System.out.println("Информация о товаре 1002: " + milk);

        // Выводим весь каталог
        System.out.println("\nВсе товары на складе:");
        manager.printAllProducts();
    }
}