package module5_collections.lesson6_hashmap.inventiry;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс InventoryManager управляет каталогом товаров на складе.
 * Хранит все товары в HashMap, где:
 *   - ключ = артикул (Integer)
 *   - значение = объект Product
 *
 * Это позволяет мгновенно находить товар по артикулу (O(1)).
 */
public class InventoryManager {

    // Поле для хранения всех товаров. Используем интерфейс Map и реализацию HashMap.
    private final Map<Integer, Product> products = new HashMap<>();

    /**
     * Добавляет новый товар в каталог.
     * Если товар с таким артикулом уже существует — ничего не делает (игнорирует).
     *
     * @param article      уникальный артикул товара
     * @param name         название товара
     * @param initialStock начальный остаток
     */
    public void addProduct(Integer article, String name, int initialStock) {
        // containsKey() проверяет, есть ли уже такой артикул
        if (!products.containsKey(article)) {
            // Создаём новый Product и кладём в карту
            products.put(article, new Product(article, name, initialStock));
        }
        // Если артикул уже есть — просто ничего не делаем
    }

    /**
     * Проверяет, существует ли товар с указанным артикулом.
     *
     * @param article артикул
     * @return true, если товар есть; false — если нет
     */
    public boolean hasProduct(Integer article) {
        return products.containsKey(article);
    }

    /**
     * Возвращает товар по артикулу.
     * Если товара нет — возвращает null.
     *
     * @param article артикул
     * @return объект Product или null
     */
    public Product getProduct(Integer article) {
        return products.get(article); // get() сам вернёт null, если ключа нет
    }

    /**
     * Увеличивает остаток товара на указанное количество.
     * Работает только если товар существует.
     *
     * @param article артикул товара
     * @param amount  на сколько увеличить остаток (должно быть >= 0)
     */
    public void increaseStock(Integer article, int amount) {
        // Сначала получаем текущий товар
        Product existing = products.get(article);
        if (existing != null && amount > 0) {
            // Создаём новый Product с обновлённым остатком
            // (так как record неизменяем, мы не можем изменить поле напрямую)
            Product updated = new Product(existing.article(), existing.name(), existing.stock() + amount);
            // Заменяем старый товар на новый в карте
            products.put(article, updated);
        }
    }

    /**
     * Уменьшает остаток товара на указанное количество.
     * Не допускает отрицательного остатка.
     *
     * @param article артикул товара
     * @param amount  на сколько уменьшить остаток
     * @return true, если списание прошло успешно; false — если недостаточно товара
     */
    public boolean decreaseStock(Integer article, int amount) {
        Product existing = products.get(article);
        // Проверяем, что товар существует и amount корректен
        if (existing == null || amount <= 0) {
            return false;
        }
        // Проверяем, хватает ли остатка
        if (existing.stock() >= amount) {
            // Создаём обновлённый товар с уменьшенным остатком
            Product updated = new Product(existing.article(), existing.name(), existing.stock() - amount);
            products.put(article, updated);
            return true;
        } else {
            // Недостаточно товара — не списываем
            return false;
        }
    }

    /**
     * Выводит информацию обо всех товарах в каталоге.
     * Порядок может быть произвольным (HashMap не сохраняет порядок).
     */
    public void printAllProducts() {
        for (Product product : products.values()) {
            System.out.println("Артикул: " + product.article() +
                    ", Название: " + product.name() +
                    ", Остаток: " + product.stock());
        }
    }
}