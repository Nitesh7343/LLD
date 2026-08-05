package FacadeDP;

public class NotificationService {
    public void sendNotif(String email, String message) {
        System.out.printf("Notification sent: %s to %s %n",message,email);
    }
}
