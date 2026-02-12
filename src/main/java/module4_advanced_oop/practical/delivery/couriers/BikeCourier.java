package module4_advanced_oop.practical.delivery.couriers;

import module4_advanced_oop.practical.delivery.interfaces.Maintainable;

/**
 * Велокурьер — быстрее пешего, но велосипед изнашивается.
 */
public class BikeCourier extends Courier implements Maintainable {
    // Уровень износа: от 0 (новый) до 100 (сломан)
    private int wearLevel = 0;

    public BikeCourier(String name, int speed) {
        super(name, speed);
    }

    /**
     * Переопределяем движение: при каждом ходе велосипед изнашивается.
     */
    @Override
    public void move() {
        // Если уже сломан — не двигаемся
        if (wearLevel >= 100) {
            System.out.println(name + " не может ехать — велосипед сломан!");
            return;
        }
        // Иначе — едем и изнашиваемся
        wearLevel += 5; // каждый ход +5 износа
        super.move(); // вызываем базовое движение (position += speed)
        System.out.println(name + " едет на велосипеде. Износ: " + wearLevel);
    }

    /**
     * Нуждается ли в обслуживании? (если износ >= 80)
     */
    @Override
    public boolean needsMaintenance() {
        return wearLevel >= 80;
    }

    /**
     * Починить велосипед — сбросить износ.
     */
    @Override
    public void performMaintenance() {
        wearLevel = 0;
        System.out.println(name + " починил велосипед!");
    }
}
