package 下半.day31_多线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class 多线程_05 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCa1lable的对象(表示多线程要执行的任务)
        MyCallable mc = new MyCallable();

        //创建FutureTask的对象(作用管理多线程运行的结果)
        FutureTask<Integer> ft = new FutureTask<>(mc);

        //创建线程的对象
        Thread t1 = new Thread(ft);

        //开启线程
        t1.start();

        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
