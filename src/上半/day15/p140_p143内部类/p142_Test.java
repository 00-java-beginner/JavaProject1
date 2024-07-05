package 上半.day15.p140_p143内部类;

public class p142_Test {
    public static void main(String[] args) {
        /*注意事项:
            1.静态内部类也是成员内部类中的一种
            2.静态内部类只能访问外部类中的静态变量和静态方法,
            如果想要访问非静态的需要创建外部类的对象。
        创建静态内部类对象的格式:
            外部类名.内部类名 对象名=new外部类名.内部类名();
        调用静态方法的格式:
            外部类名.内部类名.方法名();
*/
        //创建静态内部类的对象，只要是静态的对象，都可以用类名点获取
        //1.调用非静态方法
        p142_Outer.Inner oi = new p142_Outer.Inner();
        oi.show1();
        //2.调用静态方法
        p142_Outer.Inner.show2();
    }
}
