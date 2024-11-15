package 下半.day31_多线程;

public class 多线程_06 {
    public static void main(String[] args) {
       /* MyTest t1 = new MyTest();
        MyTest t2 = new MyTest();
        MyTest t3 = new MyTest();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();*/

        MyTestMethod mtm = new MyTestMethod();
        Thread t1 = new Thread(mtm);
        Thread t2 = new Thread(mtm);
        Thread t3 = new Thread(mtm);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
