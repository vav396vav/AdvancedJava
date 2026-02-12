package module4_advanced_oop.practical.vehicle_races;


import module4_advanced_oop.practical.vehicle_races.vehicles.Bicycle;
import module4_advanced_oop.practical.vehicle_races.vehicles.Car;
import module4_advanced_oop.practical.vehicle_races.vehicles.Truck;
import module4_advanced_oop.practical.vehicle_races.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 5);
        Vehicle bike = new Bicycle("Stels", 3);
        Vehicle truck = new Truck("Volvo", 6);

        // Загружаем грузовик
        ((Truck) truck).loadCargo(1000);

        Vehicle[] participants = {car, bike, truck};

        Competition competition = new Competition(30);
        Vehicle winner = competition.race(participants);

        System.out.println("\n🏆 Победил: " + winner.getModel() +
                " на позиции " + winner.getPosition());
    }
}