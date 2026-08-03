package SingletonDP;

public class Service1 {
    Analytics analytics = Analytics.getInstance();

    void run() {
        System.out.println("Success");
        analytics.count();
    }

    void submit() {
        System.out.println("Submitted");
        analytics.count();
    }
}
