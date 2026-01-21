package module4_advanced_oop.practical.delivery.couriers;

/**
 * Пеший курьер — самый простой.
 * Он не ломается, не требует топлива, просто идёт.
 */
public class FootCourier extends Courier {
    // Наследуем всё от Courier
    public FootCourier(String name, int speed) {
        super(name, speed); // вызываем конструктор родителя
    }

    // Не переопределяем move() — используем базовый
}


