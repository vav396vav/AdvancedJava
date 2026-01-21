package module4_advanced_oop.practical.vehicle_races;


import module4_advanced_oop.practical.vehicle_races.vehicles.Vehicle;

public class Competition {
    private int distance;

    public Competition(int distance) {
        this.distance = distance;
    }


    public Vehicle race(Vehicle[] vehicles) {
        System.out.println("Старт гонки на дистанцию " + distance + "!");
        while (true) {
            for (Vehicle v : vehicles) {
                if (v.getPosition() >= distance) {
                    return v; // уже финишировал ранее
                }
                v.move(); // делает один ход
                if (v.getPosition() >= distance) {
                    return v; // победитель!
                }
            }
            System.out.println("--- Новый раунд ---");
        }
    }
}