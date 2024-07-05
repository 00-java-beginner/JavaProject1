package 上半.day15.p138_接口和抽象类综合练习;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教篮球");
    }
}
