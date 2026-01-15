package module2_separateobjecttypes.lesson2_typewrappers;

import lombok.Getter;

import java.util.Objects;
import java.util.Scanner;
@Getter
public class NumberAnalyzer {
    private Scanner sc = new Scanner(System.in);

    private Integer number;

    public NumberAnalyzer(){
        System.out.print("Введите число: ");
        this.number = sc.nextInt();
    }

    public boolean isPositive(){
        return number > 0;
    }

    public boolean isNegative(){
        return number < 0;
    }

    public boolean isZero(){
        return number == 0;
    }

    @Override
    public String toString(){
        return "Число: " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberAnalyzer that)) return false;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public void getAbsValue(){
        if (number < 0){
            System.out.println("Модуль числа: " + Math.abs(number));
        } else {
            System.out.println("Число: " + number);
        }

    }

    public static void main(String[] args) {
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        System.out.println(numberAnalyzer);
        System.out.println("Число положительное: " + numberAnalyzer.isPositive());
        System.out.println("Число отрицательное: " + numberAnalyzer.isNegative());
        System.out.println("Число равно 0: " + numberAnalyzer.isZero());
        numberAnalyzer.getAbsValue();
    }
}
