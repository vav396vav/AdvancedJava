package module4_advanced_oop.lesson2_inheritance.transport;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return "Транспортное средство марки " + brand + " года выпуска " + year + ".";
    }
}
