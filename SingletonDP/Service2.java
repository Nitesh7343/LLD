package SingletonDP;

public class Service2 {
    Analytics analytics = Analytics.getInstance();

    void submit() {
        System.out.println("Submitted");
        analytics.count();
    }

    void run() {
        System.out.println("Success");
        analytics.count();
    }
}
