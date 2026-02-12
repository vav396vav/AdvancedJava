package module4_advanced_oop.lesson3_access_modifiers.library;

public class LibraryUtils {

    static void validateIsbn(String isbn) {
        if(isbn.length() != 13) {
            System.out.println("ISBN должен состоять из 13 цифр");
        }
    }
}
