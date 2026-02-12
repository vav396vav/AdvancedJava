package module5_collections.lesson6_hashmap.inventiry;

/**
 * Record Product представляет один товар в магазине.
 * Используем record, потому что это неизменяемый класс данных:
 * - артикул (уникальный идентификатор)
 * - название
 * - текущий остаток на складе
 *
 * Record автоматически генерирует:
 * - конструктор с параметрами
 * - геттеры (article(), name(), stock())
 * - equals(), hashCode(), toString()
 */
public record Product(Integer article, String name, int stock) {
}