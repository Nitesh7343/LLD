package ObserverDP;

import javax.swing.plaf.basic.BasicMenuUI.ChangeHandler;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel techie = new YoutubeChannel("Techie");

        techie.subsribe(new mobileAppSubscriber("John"));
        techie.subsribe(new mobileAppSubscriber("Alex"));
        techie.subsribe(new mobileAppSubscriber("Alice"));
        techie.subsribe(new mobileAppSubscriber("Bob"));
        techie.subsribe(new emailSubscriber("cena@yahoo.com"));
        techie.subsribe(new emailSubscriber("messi@yahoo.com"));
        techie.subsribe(new emailSubscriber("ronaldo@yahoo.com"));

        techie.uploadVideo("Let's dive into ethical hacking!");
    }
}
