
public class Main {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        print(a);
    }

    static void change(int a) {
        a = 20;
    }

    static void print(int a) {
        System.out.println(a);
    }
}