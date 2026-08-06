package BridgeDP;

public interface VideoQuality {
    void play();
}

class HDQuality implements VideoQuality{
    public void play() {
        System.out.println("Playing content in HD quality");
    }
}

class UltraHDQuality implements VideoQuality{
    public void play() {
        System.out.println("Playing content in UltraHD quality");
    }
}

class K4Quality implements VideoQuality{
    public void play() {
        System.out.println("Playing content in 4K quality");
    }
}

class K8Quality implements VideoQuality{
    public void play() {
        System.out.println("Playing content in 8K quality");
    }
}
