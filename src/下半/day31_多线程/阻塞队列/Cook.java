package 下半.day31_多线程.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;
    public Cook (ArrayBlockingQueue<String> queue) {
        this.queue= queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                //put方法在底层有lock锁，所以这里不需要在添加锁
                queue.put("面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("厨师放了一碗面条");
        }
    }
}
