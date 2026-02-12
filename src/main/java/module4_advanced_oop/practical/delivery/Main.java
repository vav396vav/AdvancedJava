package module4_advanced_oop.practical.delivery;

import module4_advanced_oop.practical.delivery.couriers.BikeCourier;
import module4_advanced_oop.practical.delivery.couriers.CarCourier;
import module4_advanced_oop.practical.delivery.couriers.Courier;
import module4_advanced_oop.practical.delivery.couriers.FootCourier;

/**
 * Главный класс — точка входа в программу.
 */
public class Main {
    public static void main(String[] args) {
        // Создаём трёх курьеров
        Courier foot = new FootCourier("Иван", 2);      // медленный, но надёжный
        Courier bike = new BikeCourier("Анна", 4);      // быстрый, но изнашивается
        Courier car = new CarCourier("Борис", 6);       // самый быстрый, но капризный

        // Собираем их в массив (полиморфизм!)
        Courier[] couriers = {foot, bike, car};

        // Создаём гонку на 30 единиц
        DeliveryRace race = new DeliveryRace(30);

        // Запускаем доставку
        Courier winner = race.deliver(couriers);

        // Выводим победителя
        System.out.println("\n🏆 Доставку выполнил: " + winner.getName());
    }
}
