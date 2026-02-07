package module11_exceptions_debugging.lesson2_what_are_exceptions;

import java.util.ArrayList;

public class ExceptionPredictor {
    public static void main(String[] args) {
        System.out.println("Выполняется операция 1: деление на ноль");
        int division = 10 / 0;
        System.out.println("Операция 1 завершена успешно");

        System.out.println("Выполняется операция 2: получение элемента из пустого списка");
        ArrayList<Integer> list = new ArrayList<>();
        list.get(0);
        System.out.println("Операция 2 завершена успешно");

        System.out.println("Выполняется операция 3: вызов метода у null-ссылки");
        String str = null;
        str.length();
        System.out.println("Операция 3 завершена успешно");

        System.out.println("Выполняется операция 4: преобразование некорректной строки в число");
        int integer = Integer.parseInt("abc");
        System.out.println("Операция 4 завершена успешно");

        System.out.println("Выполняется операция 5: доступ к несуществующему элементу массива");
        int[] arr = new int[]{1, 2, 3};
        int a = arr[4];
        System.out.println("Операция 5 завершена успешно");
    }
}