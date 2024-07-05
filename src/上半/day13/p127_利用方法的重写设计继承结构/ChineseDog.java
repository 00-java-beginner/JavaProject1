package 上半.day13.p127_利用方法的重写设计继承结构;

public class ChineseDog extends Dog{
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
