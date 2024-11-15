package 下半.day31_多线程.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            String food = null;
            try {
                //take，所以这里不需要在添加锁
                food = queue.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(food);
        }


    }
}
