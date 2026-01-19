package module4_advanced_oop.lesson5_interfaces.devices;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Computer computer = new Computer();

        lamp.turnOn();
        lamp.turnOff();
        computer.turnOn();
        computer.turnOff();
    }
}
