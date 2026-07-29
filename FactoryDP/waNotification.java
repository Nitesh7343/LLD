package FactoryDP;

public class waNotification implements Notification {
    public void send(String message) {
        System.out.println("Sent whatsapp notification  : "+ message);
    }
}
