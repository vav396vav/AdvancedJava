package module4_advanced_oop.lesson5_interfaces.notifications;

public abstract class BaseNotifier implements Notifier {
    protected String name;

    public BaseNotifier(String name) {
        this.name = name;
    }

    public abstract String sendNotification();

    private String log(String msg){
        return "Имя: " + name + ", Сообщение: " + msg;
    }
}
