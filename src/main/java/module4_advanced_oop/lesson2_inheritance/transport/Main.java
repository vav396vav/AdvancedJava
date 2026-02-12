package module4_advanced_oop.lesson2_inheritance.transport;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW",2020 ,4);
        Truck truck = new Truck("MAN",2010, 1000);

        System.out.println(car.getDescription());
        System.out.println(truck.getDescription());
    }
}
