package module5_collections.lesson7_hashset;

public class Main {
    public static void main(String[] args) {
        TagManager tag = new TagManager();

        System.out.println("Добавлен 'Java' " + tag.addTag("Java"));
        System.out.println("Добавлен 'коллекции' " + tag.addTag("коллекции"));
        System.out.println("Добавлен 'hashSet' " + tag.addTag("hashSet"));
        System.out.println("Добавлен 'Java' " + tag.addTag("Java"));

        System.out.println("Есть ли 'Java'? " + tag.hesTag("Java"));
        System.out.println("Есть ли 'python'? " + tag.hesTag("python"));

        System.out.println("Все теги: ");
        tag.printAllTags();

        System.out.println("Всего тегов: " + tag.getTagCount());
    }
}
