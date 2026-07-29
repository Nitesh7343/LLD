package FactoryDP;

public class smsNotification implements Notification {
    public void send(String message) {
        System.out.println("Sent SMS Notification :"+message);
    }
}
