package module5_collections.lesson2_generics.universalContainer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        Container < LocalDate> container1 = new Container<>();
        container.setType("Привет, дженерики!");
        //container.setType(23); - не с компилируется
        container1.setType(LocalDate.now());

        System.out.println(container.getType() + " " + container1.getType());
    }
}
