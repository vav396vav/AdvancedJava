package module5_collections.lesson2_generics.library;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Книга 'Java Core'", new BigDecimal("1000.00"));

        library.printAllRecords();
    }
}
