package SingletonDP;

public class Main {
    public static void main(String[] args) {
        Analytics analytics = Analytics.getInstance();
        Service1 s1 = new Service1();
        Service2 s2 = new Service2();

        s1.run();
        s1.submit();
        s1.run();
        s2.run();
        s2.submit();

        System.out.println(s1.analytics.getCount());
        System.out.println(s2.analytics.getCount());
        System.out.println(analytics.getCount());

    }
}
