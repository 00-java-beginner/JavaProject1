package 上半.day15.p135_抽象类和抽象方法;

public abstract class Person {
    /*抽象类不能实例化
   抽象类中不一定有抽象方法，但有抽象方法的类一定是抽象类
   可以有构造方法
   抽象类的子类
       要么重写抽象类中的所有抽象方法
       要么是抽象类*/
    public abstract void work();
}
