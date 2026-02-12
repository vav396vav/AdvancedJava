package module4_advanced_oop.lesson4_abstractclass.shapes;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String displayInfo() {
        double area = getArea();
        return "Shape color: " + color + ", area: " + area;
    }
}
