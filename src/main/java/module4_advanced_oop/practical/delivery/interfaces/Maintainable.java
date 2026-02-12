package module4_advanced_oop.practical.delivery.interfaces;

/**
 * Этот интерфейс описывает: объект, который может сломаться и требует ремонта.
 */
public interface Maintainable {
    // Возвращает true, если нужно обслуживание (починка)
    boolean needsMaintenance();

    // Выполняет обслуживание (чинит)
    void performMaintenance();
}
