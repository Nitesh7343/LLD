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
