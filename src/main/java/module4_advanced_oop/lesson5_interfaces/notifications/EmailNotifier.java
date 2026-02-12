package module4_advanced_oop.lesson5_interfaces.notifications;

public class EmailNotifier extends BaseNotifier{
    public EmailNotifier() {
        super("Email");
    }


    @Override
    public void sendNotification(String recipient, String message) {
        log("Отправка email на " + recipient + ": " + message);
        System.out.println("📧 Email отправлен на " + recipient);
    }
}
