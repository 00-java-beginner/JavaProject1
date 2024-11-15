package 下半.day31_多线程.等待唤醒机制;

public class Desk {
    //作用：用来控制生产者和消费者的执行
    //用来判断不同场景下对应的状态 0:没有，1：有
    public static int foodFlag = 0;

    //用来控制总数
    public static int count =10;

    //创建锁对象
    public static Object lock = new Object();
}
