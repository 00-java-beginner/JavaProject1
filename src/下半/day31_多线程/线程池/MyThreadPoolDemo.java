package 下半.day31_多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        //1.创建线程池对象
        //没有上限
        //ExecutorService pool1 = Executors.newCachedThreadPool();

        //有上限
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        //2.提交任务
        pool1.submit(new MyRunnable());

        //3.销毁线程池
        pool1.shutdown();
    }
}
