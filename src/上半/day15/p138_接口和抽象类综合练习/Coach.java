package 上半.day15.p138_接口和抽象类综合练习;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }

    public abstract void teach();
}
