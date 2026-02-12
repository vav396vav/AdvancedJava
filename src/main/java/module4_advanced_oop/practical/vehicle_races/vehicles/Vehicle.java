package module4_advanced_oop.practical.vehicle_races.vehicles;

public abstract class Vehicle {
    protected String model;
    protected int speed;
    protected int x;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.x = 0;
    }

    // Базовое движение: просто прибавляем скорость
    public void move() {
        x += speed;
    }

    // Геттеры
    public String getModel() { return model; }
    public int getPosition() { return x; }
}
