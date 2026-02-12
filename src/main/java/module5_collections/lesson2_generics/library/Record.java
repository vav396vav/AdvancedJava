package module5_collections.lesson2_generics.library;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Record<T> {

    private final T value;
    private final LocalDateTime timestamp;

    public Record(T value) {
        this.value = value;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Запись от " + timestamp + ": " + value + " ";
    }
}
