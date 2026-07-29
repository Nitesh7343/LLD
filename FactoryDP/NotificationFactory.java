package FactoryDP;

public class NotificationFactory {
    public static Notification getNotification(String type) {
        if(type.equals("email")) return new emailNotification();
        else if(type.equals("sms")) return new smsNotification();
        return new waNotification();
    }
}
