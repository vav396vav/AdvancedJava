package module4_advanced_oop.practical.delivery.interfaces;

/**
 * Этот интерфейс описывает: любой объект, который умеет двигаться.
 */
public interface Movable {
    // Метод, чтобы сделать один шаг
    void move();

    // Метод, чтобы узнать, где сейчас находится (его позицию)
    int getPosition();
}
