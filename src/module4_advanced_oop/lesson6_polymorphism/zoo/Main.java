package module4_advanced_oop.lesson6_polymorphism.zoo;

public class Main {
    public static void main(String[] args) {
       Animal a1 = new Dog("Шарик");
       Animal a2 = new Cat("Мурзик");

       a1.makeSound();
       a2.makeSound();
    }
}
