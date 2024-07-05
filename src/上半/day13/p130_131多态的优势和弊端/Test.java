package 上半.day13.p130_131多态的优势和弊端;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        //多态的弊端：不能调用子类的特有功能，只能强转后才能进行调用
        //注意：强转时如果转成其他类型，也会报错
        //解决方案：可以用instanceof关键字进行判断
        if (a instanceof Dog d){
            d.LookHome();
        }else if (a instanceof Cat c){
            c.CatchMouse();
        }else {
            System.out.println("当前类型不存在");
        }
    }
}
class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗在吃骨头");
    }
    public void LookHome(){
        System.out.println("狗在看家");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫在吃猫粮");
    }
    public void CatchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
