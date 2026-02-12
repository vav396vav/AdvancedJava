package module4_advanced_oop.practical.delivery.interfaces;

/**
 * Этот интерфейс описывает: объект, который работает на топливе.
 */
public interface Refuelable {
    // Есть ли топливо?
    boolean hasFuel();

    // Заправить до полного бака
    void refuel();
}
