package 下半.day31_多线程.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //创建对象时把阻塞队列对象传递过去，这样保证两个对象用的是同一个队列
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
