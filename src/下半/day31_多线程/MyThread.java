package 下半.day31_多线程;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "Hello word");
        }
    }
}
