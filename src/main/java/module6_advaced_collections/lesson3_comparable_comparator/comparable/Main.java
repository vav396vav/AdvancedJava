package module6_advaced_collections.lesson3_comparable_comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Преступление и наказание", "by Фёдор Достоевский"));
        books.add(new Book("Мастер и Маргарита", "by Михаил Булгаков"));
        books.add(new Book("Анна Каренина", "by Лев Толстой"));
        books.add(new Book("Евгений Онегин", "by Александр Пушкин"));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
