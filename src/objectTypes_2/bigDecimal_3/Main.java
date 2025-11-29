package objectTypes_2.bigDecimal_3;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        if (a + b == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        BigDecimal a1 = new BigDecimal("0.2");
        BigDecimal b1 = new BigDecimal(0.2);

        System.out.println(a1.equals(b1));
        System.out.println(a1 == b1);
    }
}
