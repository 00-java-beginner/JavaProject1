package 上半.day15.p140_p143内部类;

public class p142_Outer {
    //int a = 10;
    //static int b = 20;
    //静态内部类
    static class Inner{
        public void show1(){
            System.out.println("非静态方法被调用了");
            //如果想要访问非静态的需要创建外部类的对象。
            /*p142_Outer o = new p142_Outer();
            System.out.println(o.a);
            System.out.println(b);*/

        }
        public static void show2(){
            System.out.println("静态方法被调用了");
            //如果想要访问非静态的需要创建外部类的对象。
            /*p142_Outer o = new p142_Outer();
            System.out.println(o.a);
            System.out.println(b);*/
        }
    }
}
