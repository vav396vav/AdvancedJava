package module4_advanced_oop.practical.vehicle_races.vehicles;

import module4_advanced_oop.practical.vehicle_races.interfaces.Breakable;
import module4_advanced_oop.practical.vehicle_races.interfaces.Refuelable;

public class Car extends Vehicle implements Refuelable, Breakable {
    private int fuel;
    private static final int MAX_FUEL = 10;

    public Car(String model, int speed) {
        super(model, speed);
        this.fuel = MAX_FUEL;
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
        // 30% шанс поломки
        return Math.random() <= 0.3;
    }

    @Override
    public void move() {
        if (isBroken()) {
            System.out.println(model + " сломался и не может двигаться!");
            return;
        }
        if (!hasFuel()) {
            refuel();
            return; // в этом ходу не двигается
        }
        fuel--;
        super.move();
        System.out.println(model + " проехал. Осталось топлива: " + fuel);
    }
}

