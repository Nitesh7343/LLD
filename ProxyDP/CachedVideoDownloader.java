package ProxyDP;

import java.util.Map;
import java.util.HashMap;

//Proxy Layer
public class CachedVideoDownloader implements VideoDownloader {
    RealVideoDownloader downloader;
    static Map<String,String> cached = new HashMap<>();

    CachedVideoDownloader() {
        this.downloader = new RealVideoDownloader();
    }

    public String downloadVideo(String url) {
        if(cached.containsKey(url)){
            System.out.println("Retrieved video from cache "+url);
            return cached.get(url);
        }
        else {
            String content = downloader.downloadVideo(url);
            cached.put(url,content);
            return content;
        }
    }
}
