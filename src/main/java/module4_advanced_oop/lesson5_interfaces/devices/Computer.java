package module4_advanced_oop.lesson5_interfaces.devices;

public class Computer implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Компьютер включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Компьютер выключен");
    }
}
