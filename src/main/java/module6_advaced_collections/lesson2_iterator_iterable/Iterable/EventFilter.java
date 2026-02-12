package module6_advaced_collections.lesson2_iterator_iterable.Iterable;

import java.util.Iterator;

public class EventFilter {
    public static void removeEventsContaining(EventLog log, String forbiddenWord){
        Iterator<String> it = log.iterator();

        while(it.hasNext()){
            String event = it.next();
            if(event.toLowerCase().contains(forbiddenWord.toLowerCase())) {
                it.remove();
                System.out.println("Это событие было удалено: " + event);
            }
        }
    }
}
