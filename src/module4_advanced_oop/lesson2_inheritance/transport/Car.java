package module4_advanced_oop.lesson2_inheritance.transport;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getDescription() {
        return "Автомобиль марки " + getBrand() + " года выпуска " + getYear() +
                " количество дверей: " + numberOfDoors ;
    }
}
