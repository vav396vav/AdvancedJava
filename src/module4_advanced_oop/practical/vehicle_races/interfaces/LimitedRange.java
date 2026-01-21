package module4_advanced_oop.practical.vehicle_races.interfaces;

public interface LimitedRange {
    // Лимит пробега
    boolean canMove(); // Может ли ещё двигаться?
    void consumeRange(); // Потратить единицу ресурса
}
