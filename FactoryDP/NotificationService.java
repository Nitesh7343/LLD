package FactoryDP;

public class NotificationService {

    public void sendNotification(String type, String message) {
        Notification notification = NotificationFactory.getNotification(type);
        notification.send(message);
    }
}
