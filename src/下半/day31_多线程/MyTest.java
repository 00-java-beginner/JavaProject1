package 下半.day31_多线程;

public class MyTest extends Thread {
    //添加static关键字表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;

    //锁对象，一定要是唯一的,可以添加static和final关键字
    //static final Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //同步代码块：可以处理多个线程同时运行时的随机性
            //锁对象可以写当前类的字节码文件
            synchronized (MyTest.class){
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张电影票");
                } else {
                    break;
                }
            }
        }
    }
}
