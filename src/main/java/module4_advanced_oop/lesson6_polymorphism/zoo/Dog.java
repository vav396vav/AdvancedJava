package module4_advanced_oop.lesson6_polymorphism.zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака " + name + " гавкает");
    }
}
