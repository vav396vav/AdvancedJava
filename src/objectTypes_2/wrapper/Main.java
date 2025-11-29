package objectTypes_2.wrapper;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        Integer a1 = a;
        Integer b1 = Integer.valueOf(b);
        Integer c1 = 100;

        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));
        System.out.println(a1 == c1);
        System.out.println(b1 == c1);
        System.out.println(a1.equals(c1));
        System.out.println(b1.equals(c1));

    }
}
