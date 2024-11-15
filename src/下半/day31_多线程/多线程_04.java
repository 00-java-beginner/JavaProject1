package 下半.day31_多线程;

public class 多线程_04 {
    public static void main(String[] args) {
        //Runnable
        //创建对象
        MyRun mr = new MyRun();

        //创建对象将需要实现的代码放入
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //给线程取名字
        t1.setName("线程1");
        t2.setName("线程2");

        //启动多线程
        t1.start();
        t2.start();
    }
}
