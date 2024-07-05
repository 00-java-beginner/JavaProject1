package 上半.day15.p140_p143内部类;

public class p142Outer {
    int a = 10;
    public void show(){
        int b = 20;
        //局部内部类
        class Inner{
            String name;
            int age;
            public void method(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method方法");
            }
            public static void method1(){
                System.out.println("局部内部类中的method1静态方法");
            }
        }
        //需要在方法内部创建对象并使用
        Inner i = new Inner();
        System.out.println(i.age);
        System.out.println(i.name);
        i.method();
        Inner.method1();


    }
}
