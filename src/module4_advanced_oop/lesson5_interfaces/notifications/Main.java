package module4_advanced_oop.lesson5_interfaces.notifications;

public class Main {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier sms = new SmsNotifier();

        email.sendNotification("user@example.com", "Добро пожаловать в систему!");
        sms.sendNotification("+79991234567", "Ваш код подтверждения: 123456");
    }
}