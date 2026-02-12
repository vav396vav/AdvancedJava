package module5_collections.lesson5_linkedlist;

public class Main {
    public static void main(String[] args) {
        PrintQueue queue = new PrintQueue();

        queue.addDocument("Отчёт.pdf");
        queue.addDocument("Счёт.docx");
        queue.addDocument("Письмо.txt");

        System.out.println("Печать: " + queue.printNextDocument());
        System.out.println("Печать: " + queue.printNextDocument());
        System.out.println("Осталось документов: " + queue.getQueueSize() + " шт.");
    }
}
