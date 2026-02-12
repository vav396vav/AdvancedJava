package module4_advanced_oop.lesson5_interfaces.devices;

public class Lamp implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Лампочка включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Лампочка выключена");
    }
}
