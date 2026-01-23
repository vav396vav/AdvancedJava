package module5_collections.lesson5_linkedlist;

import java.util.LinkedList;
import java.util.List;

public class PrintQueue {

    List<String> documents = new LinkedList<>();

    void addDocument(String name) {
        documents.addLast(name);
    }

    public String printNextDocument() {
        if (documents.isEmpty()) {
            return null;
        } else {
            return documents.removeFirst();
        }
    }

    public int getQueueSize() {
        return documents.size();
    }
}
