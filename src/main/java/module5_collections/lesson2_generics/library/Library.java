package module5_collections.lesson2_generics.library;

import java.math.BigDecimal;

public class Library {
    private Record<String> note;
    private Record<BigDecimal> price;

    public Library(String note, BigDecimal price){
        if (note != null && price != null){
            this.note = new Record<>(note);
            this.price = new Record<>(price);
        }
    }

    // Пояснить почему не работает
    public Library(Record<String> note, Record<BigDecimal> price) {
        this.note = note;
        this.price = price;
    }

    public void printAllRecords(){
        System.out.println(note.toString() + price.toString());
    }
}
