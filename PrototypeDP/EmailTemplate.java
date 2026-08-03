package PrototypeDP;

public interface EmailTemplate extends Cloneable {
    WelcomeEmail clone();
    void setContent(String content);
    void send(String to);
    String getContent();
}
