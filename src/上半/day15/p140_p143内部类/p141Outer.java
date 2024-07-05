package 上半.day15.p140_p143内部类;

public class p141Outer {
    String name;
    public class Inner{
        //JDK16之前不能定义静态变量,JDK 16开始才可以定义静态变量。
        static int a = 10;
    }
    //二、获取成员内部类对象的两种方式:
    //1.外部类编写方法,对外提供内部类对象
    public Inner getInstance(){
        return new Inner();
    }
}
