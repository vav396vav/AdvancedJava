package module4_advanced_oop.lesson2_inheritance.transport;


public class Truck extends Vehicle {

    private double maxLoadTons;

    public Truck(String brand, int year, double maxLoadTons) {
        super(brand, year);
        this.maxLoadTons = maxLoadTons;
    }

    @Override
    public String getDescription() {
        return "Грузовик марки " + getBrand() + " года выпуска " + getYear() +
                " с грузоподъемностью " + maxLoadTons + " тонн";
    }
}
