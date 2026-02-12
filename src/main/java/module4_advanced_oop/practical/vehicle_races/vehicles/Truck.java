package module4_advanced_oop.practical.vehicle_races.vehicles;


import module4_advanced_oop.practical.vehicle_races.interfaces.Breakable;
import module4_advanced_oop.practical.vehicle_races.interfaces.Loadable;
import module4_advanced_oop.practical.vehicle_races.interfaces.Refuelable;

public class Truck extends Vehicle implements Refuelable, Breakable, Loadable {
    private int fuel;
    private boolean loaded;
    private static final int MAX_FUEL = 15;

    public Truck(String model, int speed) {
        super(model, speed);
        this.fuel = MAX_FUEL;
        this.loaded = false;
    }

    @Override
    public void refuel() {
        fuel = MAX_FUEL;
        System.out.println(model + " заправлен.");
    }

    @Override
    public boolean hasFuel() {
        return fuel > 0;
    }

    @Override
    public boolean isBroken() {
        return Math.random() <= 0.25; // 25% шанс
    }

    @Override
    public void loadCargo(int weight) {
        loaded = true;
        // При грузе скорость уменьшается (но мы меняем её напрямую)
        // Для простоты: просто логируем
        System.out.println(model + " загружен.");
    }

    @Override
    public void unloadCargo() {
        loaded = false;
        System.out.println(model + " разгружен.");
    }

    @Override
    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public void move() {
        if (isBroken()) {
            System.out.println(model + " сломался!");
            return;
        }
        if (!hasFuel()) {
            refuel();
            return;
        }
        fuel--;

        // Если загружен — двигается медленнее
        int actualSpeed = loaded ? speed / 2 : speed;
        x += actualSpeed;

        System.out.println(model + " проехал " + actualSpeed + " ед. Осталось топлива: " + fuel);
    }
}