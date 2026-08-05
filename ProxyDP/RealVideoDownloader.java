package ProxyDP;

public class RealVideoDownloader implements VideoDownloader {

    public String downloadVideo(String url) {
        System.out.println("Downloading video: " + url);
        return "Video Content from "+url;
    }
}
