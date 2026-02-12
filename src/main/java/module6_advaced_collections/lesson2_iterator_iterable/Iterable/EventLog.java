package module6_advaced_collections.lesson2_iterator_iterable.Iterable;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventLog implements Iterable<String> {

    @Getter
    private final List<String> events = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return events.iterator();
    }

    public void addEvent(String event) {
        events.add(event);
    }
}
