package module4_advanced_oop.practical.vehicle_races.interfaces;

public interface Loadable {
    // Возможность загрузки
    void loadCargo(int weight); // Загрузить груз
    void unloadCargo(); // Разгрузить
    boolean isLoaded(); // Есть ли груз?
}
