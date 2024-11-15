package 下半.day31_多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLook extends Thread{
    static Lock lock = new ReentrantLock();
    static int ticket = 0;
    public void run() {
        while (true) {
            //同步代码块：可以处理多个线程同时运行时的随机性
            //锁对象可以写当前类的字节码文件
            lock.lock();
            try {
                if (ticket < 100) {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张电影票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
