package 下半.day31_多线程.等待唤醒机制;

public class Test {
    public static void main(String[] args) {
        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
