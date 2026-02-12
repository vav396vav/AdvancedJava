package module4_advanced_oop.practical.delivery;

import module4_advanced_oop.practical.delivery.couriers.Courier;
import module4_advanced_oop.practical.delivery.interfaces.Maintainable;
import module4_advanced_oop.practical.delivery.interfaces.Refuelable;

/**
 * Класс, который управляет гонкой доставки.
 */
public class DeliveryRace {
    // Длина дистанции (например, 30 км)
    private int distance;

    public DeliveryRace(int distance) {
        this.distance = distance;
    }

    /**
     * Запускает гонку и возвращает победителя.
     */
    public Courier deliver(Courier[] couriers) {
        System.out.println("Старт доставки на дистанцию " + distance + "!");
        // Бесконечный цикл — пока не будет победителя
        while (true) {
            // Каждый курьер делает ход по очереди
            for (Courier courier : couriers) {
                // Если кто-то уже финишировал — вернуть его
                if (courier.getPosition() >= distance) {
                    return courier;
                }

                // Проверяем: нужно ли обслуживание?
                if (courier instanceof Maintainable) {
                    Maintainable m = (Maintainable) courier;
                    if (m.needsMaintenance()) {
                        m.performMaintenance();
                        // После обслуживания — не двигаемся в этом ходу
                        continue; // переходим к следующему курьеру
                    }
                }

                // Проверяем: есть ли топливо (только для машин)?
                if (courier instanceof Refuelable) {
                    Refuelable r = (Refuelable) courier;
                    if (!r.hasFuel()) {
                        r.refuel();
                        // После заправки — не двигаемся
                        continue;
                    }
                }

                // Если всё в порядке — двигаемся!
                courier.move();

                // Проверяем: может, кто-то только что финишировал?
                if (courier.getPosition() >= distance) {
                    return courier;
                }
            }
            System.out.println("--- Конец раунда ---");
        }
    }
}
