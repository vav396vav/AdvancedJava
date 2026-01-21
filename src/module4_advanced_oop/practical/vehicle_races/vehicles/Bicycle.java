package module4_advanced_oop.practical.vehicle_races.vehicles;


import module4_advanced_oop.practical.vehicle_races.interfaces.Breakable;
import module4_advanced_oop.practical.vehicle_races.interfaces.LimitedRange;

public class Bicycle extends Vehicle implements Breakable, LimitedRange {
    private int durability; // прочность (ресурс)
    private static final int MAX_DURABILITY = 20;

    public Bicycle(String model, int speed) {
        super(model, speed);
        this.durability = MAX_DURABILITY;
    }

    @Override
    public boolean isBroken() {
        // Ломается, если прочность кончилась ИЛИ случайно (10%)
        return durability <= 0 || Math.random() <= 0.1;
    }

    @Override
    public boolean canMove() {
        return durability > 0;
    }

    @Override
    public void consumeRange() {
        durability--;
    }

    @Override
    public void move() {
        if (isBroken()) {
            System.out.println(model + " сломался!");
            return;
        }
        consumeRange();
        super.move();
        System.out.println(model + " проехал. Прочность: " + durability);
    }
}