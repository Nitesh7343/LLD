package SingletonDP;

public class Analytics {
    private int count = 0;

/*-------------------------------Eager Initialization------------------------------------------------------- */

    // private static final Analytics instance = new Analytics();

    // private Analytics() {};

    // public static Analytics getInstance() {
    //     return instance;
    // }

/*--------------------------------------------------------------------------------------------------------- */

/*-------------------------------Lazy Initialization------------------------------------------------------- */

        private static Analytics instance;
        private Analytics() {};

        public static Analytics getInstance() {
            if(instance == null) instance = new Analytics();
            return instance;
        }
/*--------------------------------------------------------------------------------------------------------- */

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
