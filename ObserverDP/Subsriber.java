package ObserverDP;

public interface Subsriber {
    void update(String videoTitle);
}

class mobileAppSubscriber implements Subsriber{
    private String username;

    mobileAppSubscriber(String username) {
        this.username = username;
    }

    public void update(String videoTitle) {
        System.out.printf("App notification sent to %s for %s %n",username,videoTitle);
    } 
}

class emailSubscriber implements Subsriber{
    private String email;

    emailSubscriber(String email) {
        this.email = email;
    }

    public void update(String videoTitle) {
        System.out.printf("App notification sent to %s for %s %n",email,videoTitle);
    } 
}
