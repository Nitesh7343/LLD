package FlyweightDP;

import java.util.Map;
import java.util.HashMap;

public class Tree {
    //keep changing
    int x;
    int y;

    //constant..
    // String name;
    // String color;
    // String texture;

    TreeType treeType;

    Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;


        // this.name = name;
        // this.color = color;
        // this.texture = texture;
    }

    @Override
    public String toString() {
        return "Tree [x=" + x + ", y=" + y + " " + treeType;
    }

    // @Override
    // public String toString() {
    //     return "Tree [x=" + x + ", y=" + y + " " + treeType;
    // }
    

    
}

class TreeType{
    String name;
    String color;
    String texture;

    TreeType() {
        this.name = "Oak";
        this.color = "Green";
        this.texture = "Rough";
    }

    TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "name=" + name + ", color=" + color + ", texture=" + texture + "]";
    }
}

class TreeTypeFactory{
    static Map<String,TreeType> map = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name+color+texture;
        if(map.containsKey(key)) return map.get(key);
        else {
            TreeType treeType = new TreeType(name,color,texture);
            map.put(key,treeType);
            return treeType;
        }
    }
}
