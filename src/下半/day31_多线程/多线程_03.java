package 下半.day31_多线程;

public class 多线程_03 {
    public static void main(String[] args) {
        //thread
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
