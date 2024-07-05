package 上半.day13.p127_利用方法的重写设计继承结构;

public class DogTest {
    public static void main(String[] args) {
        //创建对象并调用
        Husky h = new Husky();
        h.breakHome();
        h.eat();
        h.drink();
        h.lookHome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();
    }
}
