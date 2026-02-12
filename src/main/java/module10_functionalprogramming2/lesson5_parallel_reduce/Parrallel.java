package module10_functionalprogramming2.lesson5_parallel_reduce;

import java.util.ArrayList;

public class Parrallel {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(Double.toHexString(Math.random()));
        }

        long start = System.currentTimeMillis();
        long count = strings.stream().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("abcd");
        }).count();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration: " + duration);

        start = System.currentTimeMillis();
        count = strings.stream().parallel().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("abcd");
        }).count();
        duration = System.currentTimeMillis() - start;
        System.out.println("Parallel duration: " + duration);
    }
}
