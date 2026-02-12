package module4_advanced_oop.lesson5_interfaces.notifications;

/**
 * Конкретный способ отправки уведомлений — SMS.
 */
public class SmsNotifier extends BaseNotifier {
    public SmsNotifier() {
        super("SMS");
    }

    @Override
    public void sendNotification(String recipient, String message) {
        log("Отправка SMS на " + recipient + ": " + message);
        System.out.println("📱 SMS отправлено на " + recipient);
    }
}