package module4_advanced_oop.practical.delivery.couriers;

import module4_advanced_oop.practical.delivery.interfaces.Maintainable;
import module4_advanced_oop.practical.delivery.interfaces.Refuelable;

/**
 * Автокурьер — самый быстрый, но требует топлива и техобслуживания.
 */
public class CarCourier extends Courier implements Refuelable, Maintainable {
    // Топливо: максимум 20 единиц
    private int fuel = 20;

    // Часы работы двигателя: после 50 часов — нужен ремонт
    private int engineHours = 0;

    public CarCourier(String name, int speed) {
        super(name, speed);
    }

    /**
     * Движение машины: тратит топливо и мотает часы двигателя.
     */
    @Override
    public void move() {
        // Если нет топлива — не едем
        if (!hasFuel()) {
            System.out.println(name + " не может ехать — нет топлива!");
            return;
        }
        // Тратим топливо
        fuel--;
        // Мотаем часы двигателя
        engineHours++;
        // Двигаемся
        super.move();
        System.out.println(name + " едет на машине. Топливо: " + fuel + ", Часы: " + engineHours);
    }

    // --- Реализация Refuelable ---
    @Override
    public boolean hasFuel() {
        return fuel > 0;
    }

    @Override
    public void refuel() {
        fuel = 20;
        System.out.println(name + " заправился.");
    }

    // --- Реализация Maintainable ---
    @Override
    public boolean needsMaintenance() {
        return engineHours >= 50;
    }

    @Override
    public void performMaintenance() {
        engineHours = 0;
        System.out.println(name + " прошёл техобслуживание.");
    }
}
