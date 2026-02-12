package module6_advaced_collections.lesson3_comparable_comparator.comparable;

import lombok.Getter;

@Getter
public class Book implements Comparable<Book> {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book obj) {
        return this.title.compareTo(obj.title);
    }

    @Override
    public String toString() {
        return "<<" + title + ">>" + author;
    }

}
