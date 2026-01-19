package module4_advanced_oop.lesson3_access_modifiers.library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Марк Твен", "Приключения", "1222121212121");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getIsbn());
        LibraryUtils.validateIsbn("4323423555555");
    }
}
