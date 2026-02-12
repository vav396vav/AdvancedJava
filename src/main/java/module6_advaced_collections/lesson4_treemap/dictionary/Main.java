package module6_advaced_collections.lesson4_treemap.dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addTranslation("яблоко", "apple");
        dictionary.addTranslation("машина","car");
        dictionary.addTranslation("дом", "house");
        dictionary.addTranslation("книга", "book");
        dictionary.addTranslation("дерево", "tree");

        dictionary.printAll();
    }
}
