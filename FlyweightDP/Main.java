package FlyweightDP;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        for(int i = 1; i <= 100;i++) {
            forest.plantTree(i, i, "Alovera", "Green", "Rough");
        }

        forest.draw();
        System.out.println(TreeTypeFactory.map);
    }
}
