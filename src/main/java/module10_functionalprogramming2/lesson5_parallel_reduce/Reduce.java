package module10_functionalprogramming2.lesson5_parallel_reduce;

import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 3};
        // нахождение суммы элементов массива
        int result = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        int result1 = Arrays.stream(numbers).reduce(0, Integer::sum);
        int result2 = Arrays.stream(numbers).sum();

        // нахождение среднего арифметического
        double result3 = Arrays.stream(numbers).average().orElse(0.0);

        // нахождение максимального и минимального
        long result4 = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        int result5 = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
