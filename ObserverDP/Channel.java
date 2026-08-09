package ObserverDP;

import java.util.List;
import java.util.ArrayList;

public interface Channel {
    void subsribe(Subsriber user);
    void unsubsribe(Subsriber user);
    void notifySubscriber(String videoTitle);
}

class YoutubeChannel implements Channel{
    private List<Subsriber> subsribers = new ArrayList<>();
    private String channelName;

    YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void subsribe(Subsriber user) {
        subsribers.add(user);
        System.out.println("New Subscriber, Total : "+subsribers.size());
    }

    public void unsubsribe(Subsriber user) {
        subsribers.remove(user);
        System.out.println("Use unsubcribed, Total : "+subsribers.size());
    }

    public void notifySubscriber(String videoTitle) {
        for(Subsriber user : subsribers) {
            user.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println(channelName + " Uploaded " + videoTitle);
        notifySubscriber(videoTitle);
    }
}
