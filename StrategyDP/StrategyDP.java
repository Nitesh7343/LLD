import java.util.*;

class Robot{
    WalkableRobot wr;
    TalkableRobot tr;
    FlyableRobot fr;

    public Robot(WalkableRobot wr, TalkableRobot tr, FlyableRobot fr) {
        this.wr = wr;
        this.tr = tr;
        this.fr = fr;
    }

    void walk() {
        wr.walk();
    }

    void talk() {
        tr.talk();
    }

    void fly() {
        fr.fly();
    }

    void projection() {
        System.out.println("I'm normally projected");
    }
}

interface  WalkableRobot{
    void walk();
}

interface  TalkableRobot{
    void talk();
}

interface FlyableRobot{
    void fly();
}

class NormalWalk implements WalkableRobot{
    public void walk() {
        System.out.println("I walk normally");
    }
}

class JumpWalk implements WalkableRobot{
    public void walk() {
        System.out.println("I walk by jumping");
    }
}

class NoWalk implements WalkableRobot{
    public void walk() {
        System.out.println("I cant't walk");
    }
}

class NormalTalk implements TalkableRobot{
    public void talk() {
        System.out.println("I talk normally");
    }
}

class NoTalk implements TalkableRobot{
    public void talk() {
        System.out.println("I can't talk");
    }
}

class JetFly implements FlyableRobot{
    public void fly() {
        System.out.println("I fly by jet");
    }
}

class NoFly implements FlyableRobot{
    public void fly() {
        System.out.println("I can't fly");
    }
}

class WingFly implements FlyableRobot{
    public void fly() {
        System.out.println("I fly with wings");
    }
}

public class StrategyDP {
    public static void main(String[] args) {
        Robot rubi = new Robot(new NoWalk(),new NormalTalk(),new JetFly());
        rubi.walk();
        rubi.talk();
        rubi.fly();
        System.out.println("-----------------------");

        Robot dora = new Robot(new JumpWalk(), new NoTalk(),new WingFly());
        dora.walk();
        dora.talk();
        dora.fly();
    }
}