package module4_advanced_oop.practical.delivery.couriers;

import lombok.Getter;
import module4_advanced_oop.practical.delivery.interfaces.Movable;

/**
 * Абстрактный класс — общий предок всех курьеров.
 * Нельзя создать просто "Courier", только его подвиды.
 */
public abstract class Courier implements Movable {
    /**
     * -- GETTER --
     *  Возвращает имя курьера.
     */
    // Имя курьера (например, "Иван")
    @Getter
    protected String name;

    // Сколько единиц пути он проходит за один ход
    protected int speed;

    // Где он сейчас находится (0 = старт)
    protected int position;

    /**
     * Конструктор: при создании курьера указываем имя и скорость.
     */
    public Courier(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.position = 0; // Все начинают с нуля
    }

    /**
     * Базовое движение: просто прибавляем скорость к позиции.
     * Подклассы могут изменить это поведение.
     */
    @Override
    public void move() {
        position += speed;
    }

    /**
     * Возвращает текущую позицию.
     */
    @Override
    public int getPosition() {
        return position;
    }

}
