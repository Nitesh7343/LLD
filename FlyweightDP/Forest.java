package FlyweightDP;

import java.util.List;
import java.util.ArrayList;

public class Forest {
    private List<Tree> forest = new ArrayList<>();

    void plantTree(int x, int y, String name, String color, String texture) {
        Tree tree = new Tree(x,y,TreeTypeFactory.getTreeType(name, color, texture));
        forest.add(tree);
    }

    public void draw(){
        for(Tree tree : forest) {
            System.out.println(tree);
        }
    }
}
