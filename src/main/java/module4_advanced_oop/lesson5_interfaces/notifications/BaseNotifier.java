package module4_advanced_oop.lesson5_interfaces.notifications;


public abstract class BaseNotifier implements Notifier {
    protected String name;

    protected BaseNotifier(String name) {
        this.name = name;
    }

    @Override
    public abstract void sendNotification(String recipient, String message);

    protected String log(String msg){
        return "Имя: " + name + ", Сообщение: " + msg;
    }
}
