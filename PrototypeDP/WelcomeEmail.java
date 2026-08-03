package PrototypeDP;

public class WelcomeEmail implements EmailTemplate {
    String content;
    String to;

    WelcomeEmail() {
        this.content = "Welcome Email";
        this.to = "No email";
    }

    public WelcomeEmail clone() {
        try {
            return (WelcomeEmail) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed");
        }
    }

    public void setContent(String content){
        this.content = content;
    }

    public void send(String to) {
        System.out.println("Sending email to: "+to+ ": [ "+content + " ]");
    }

    public String getContent() {
        return content;
    }
}
