package module4_advanced_oop.lesson6_polymorphism.zoo;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}
