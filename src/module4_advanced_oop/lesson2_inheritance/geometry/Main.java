package module4_advanced_oop.lesson2_inheritance.geometry;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Синий.", 20, 10);
        Circle circle = new Circle("Красный.", 10);

        System.out.println("Прямоугольник цветом: " + rectangle.getColor() + " Площадь: " + rectangle.getArea());
        System.out.println("Круг цветом: " + circle.getColor() + " Площадь: " + circle.getArea());
    }
}