package 上半.day15.p140_p143内部类;

public class p141Test {
    public static void main(String[] args) {
        /*
        一、编写成员内部类的注意点:
        1.成员内部类可以被一些修饰符所修饰,比如:private,默认,protected,public,static等
        2.在成员内部类里面,JDK16之前不能定义静态变量,JDK 16开始才可以定义静态变量。

        二、获取成员内部类对象的两种方式:
        1.外部类编写方法,对外提供内部类对象(private)

        2.直接创建
        格式:外部类名.内部类名 对象名 = 外部类对象.内部类对象
        范例:Outer.Inner oi=new Outer().new Inner()
*/
        //成员变量只能通过创建对象的方式去调用
        //因此想要调用内部类的成员变量只能先创建外部类对象才可?以调用内部类对象
        //如果内部类被private修饰，不能直接调用
        p141Outer.Inner oi = new p141Outer().new Inner();

        //1.外部类编写方法,对外提供内部类对象
        p141Outer o = new p141Outer();
        System.out.println(o.getInstance());

    }
}
