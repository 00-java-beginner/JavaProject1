package 下半.day31_多线程.等待唤醒机制;

public class Foodie extends Thread{
    @Override
    public void run() {
        //1.循环
        while (true){
            //2.同步代码块
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    //3.判断共享数据是否到了末尾（到了）
                    break;
                }else {
                    //4.判断共享数据是否到了末尾（没到）
                    //先判断桌子上是否有面条
                    if (Desk.foodFlag == 0){
                        //如果没有，就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //把吃的总数-1
                        Desk.count--;
                        //如果有，就开吃
                        System.out.println("吃货正在吃第" + Desk.count + "碗面条");
                        //吃完之后，唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }



    }
}
