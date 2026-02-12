package module4_advanced_oop.lesson6_polymorphism.zoo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Кот " + name + " мяукает");
    }
}
