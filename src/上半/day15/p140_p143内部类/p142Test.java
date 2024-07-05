package 上半.day15.p140_p143内部类;

public class p142Test {
    public static void main(String[] args) {
        /*局部内部类
        1.将内部类定义在方法里面就叫做局部内部类,类似于方法里面的局部变量。
        2.外界是无法直接使用局部内部类,需要在方法内部创建对象并使用
        3.该类可以直接访问外部类的成员,也可以访问方法内的)局部变量。*/

        //调用show方法，执行代码
        p142Outer o = new p142Outer();
        o.show();
    }
}
