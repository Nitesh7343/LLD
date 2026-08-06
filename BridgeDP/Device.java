package BridgeDP;

public abstract class Device {
    VideoQuality quality;

    public Device(VideoQuality quality) {
        this.quality = quality;
    }

    public abstract void play();
}

class MobileDevice extends Device {
    public MobileDevice(VideoQuality quality) {
        super(quality);
    }

    public void play() {
        System.out.println("Platform: Mobile");
        quality.play();
    }
}

class TVDevice extends Device {
    public TVDevice(VideoQuality quality) {
        super(quality);
    }

    public void play() {
        System.out.println("Platform: TV");
        quality.play();
    }
}

class LaptopDevice extends Device {
    public LaptopDevice(VideoQuality quality) {
        super(quality);
    }

    public void play() {
        System.out.println("Platform: Laptop");
        quality.play();
    }
}

class IpadDevice extends Device {
    public IpadDevice(VideoQuality quality) {
        super(quality);
    }

    public void play() {
        System.out.println("Platform: Ipad");
        quality.play();
    }
}
