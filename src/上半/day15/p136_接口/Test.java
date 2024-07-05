package 上半.day15.p136_接口;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("小白",1);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();

        Frog f = new Frog("小绿" , 2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        Dog d = new Dog("旺财" , 3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();
    }
}
