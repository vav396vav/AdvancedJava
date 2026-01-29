package module6_advaced_collections.lesson4_treemap.dictionary;

import java.util.TreeMap;

public class Dictionary {
    private final TreeMap<String, String> translations = new TreeMap<>();

    public void addTranslation(String russianWord, String englishWord) {
        translations.put(russianWord, englishWord);
    }

    public void printAll() {
        for (String key : translations.keySet()) {
            System.out.println(key + " -> " + translations.get(key));
        }
    }
}
