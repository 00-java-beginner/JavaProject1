package 上半.day13.p125_继承的特点和继承体系的设计;

public class Test {
    public static void main(String[] args) {
        //注意事项：
        // 1.权限修饰符：private:子类无法访问
        // 2.子类只能访问父类中非私有的成员
        //创建对象并调用
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.catchMouse();
        rd.drink();

        System.out.println("-------------------");

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();
    }
}
