package 上半.day8;

public class cp_01 {
    public static void main(String[] args) {
        //创建对象
        cp f = new cp();
        //调用属性给变量赋值
        f.setFood("红烧肉");
        f.setPrice(66);
        System.out.println(f.getFood());
        System.out.println(f.getPrice());
        //调用行为
        f.eat();

        //创建第二个对象只需要修改对象名即可
        cp f1 = new cp();
        //调用属性给变量赋值
        f1.setFood("红烧排骨");
        f1.setPrice(88);
        System.out.println(f1.getFood());
        System.out.println(f1.getPrice());
        //调用行为
        f1.eat();
    }
}
