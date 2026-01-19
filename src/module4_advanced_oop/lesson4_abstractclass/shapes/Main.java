package module4_advanced_oop.lesson4_abstractclass.shapes;

public class Main {
    public static void main(String[] args) {
        // Shape shape = new Shape(); - ошибка компиляции

        Rectangle rectangle = new Rectangle("Голубой",10,5);
        Circle circle = new Circle("Красный", 5);

        System.out.println(rectangle.displayInfo());
        System.out.println(circle.displayInfo());
    }
}
