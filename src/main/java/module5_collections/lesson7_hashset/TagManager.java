package module5_collections.lesson7_hashset;

import java.util.HashSet;
import java.util.Set;

public class TagManager {
    private final Set<String> tags = new HashSet<>();

    public boolean addTag(String tag) {
        return tags.add(tag);
    }

    public boolean hesTag(String tag) {
        return tags.contains(tag);
    }

    public void printAllTags() {
        for (String tag : tags) {
            System.out.println(tag);
        }
    }

    public int getTagCount() {
        return tags.size();
    }
}
