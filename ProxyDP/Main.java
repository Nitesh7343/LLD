package ProxyDP;

public class Main {
    public static void main(String[] args) {
        VideoDownloader video0 = new CachedVideoDownloader();
        String content0 = video0.downloadVideo("Proxy-Design-Pattern");

        VideoDownloader video1 = new CachedVideoDownloader();
        String content1 = video1.downloadVideo("DSA.mp4");

        VideoDownloader video2 = new CachedVideoDownloader();
        String content2 = video2.downloadVideo("DSA.mp4");

        VideoDownloader video3 = new CachedVideoDownloader();
        String content3 = video3.downloadVideo("Proxy-Design-Pattern");

        System.out.println(content0);
        System.out.println(content1);
        System.out.println(content2);
        System.out.println(content3);
    }
}
