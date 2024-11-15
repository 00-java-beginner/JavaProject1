package 下半.day31_多线程;

public class 多线程_07 {
    public static void main(String[] args) {
        MyLook t1 = new MyLook();
        MyLook t2 = new MyLook();
        MyLook t3 = new MyLook();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
