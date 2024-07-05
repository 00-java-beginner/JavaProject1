package 上半.day15.p138_接口和抽象类综合练习;

public class BasketballSporter extends Sporter{
    public BasketballSporter() {
    }

    public BasketballSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void Study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
