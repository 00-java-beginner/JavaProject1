package 下半.day31_多线程;

public class MyTestMethod implements Runnable{
    int ticket = 0;

    @Override
    public void run() {
        while (true){
            if (method()) break;
        }
    }

    private synchronized boolean method() {
            if (ticket == 100){
                return true;
            }else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket++;
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张电影票");
            }
            return false;
    }
}
