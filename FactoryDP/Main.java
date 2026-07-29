package FactoryDP;

public class Main{
    public static void main(String[] args) {
        
        NotificationService ns = new NotificationService();
        ns.sendNotification("email", "Hello,World!");
        ns.sendNotification("whatsapp", "Hey,Was up!");
        ns.sendNotification("sms", "Your OTP : 1297");
    }
}