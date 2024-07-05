package 上半.day15.p135_抽象类和抽象方法;

public class Test {
    public static void main(String[] args) {
        Forg f = new Forg("小绿",2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();
    }
}
