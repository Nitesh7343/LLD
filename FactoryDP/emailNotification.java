package FactoryDP;

public class emailNotification implements Notification {
    public void send(String message) {
        System.err.println("Sent email Notification : "+message);
    }
}
